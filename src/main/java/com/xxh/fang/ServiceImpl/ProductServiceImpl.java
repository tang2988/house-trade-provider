package com.xxh.fang.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xxh.fang.Dao.ProductDao;
import com.xxh.fang.Dao.SkuDao;
import com.xxh.fang.Service.ProductService;
import com.xxh.fang.Util.CustomerStatus;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ModifyProductVo;
import com.xxh.fang.entity.ProductAndSkuBO;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductPo;
import com.xxh.fang.entity.ProductVo;
import com.xxh.fang.entity.SkuPo;
import com.xxh.fang.entity.SkuVo;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Resource
	ProductDao productDao;
	@Resource
	SkuDao skuDao;

	/******************* 未开盘 *********************/
	public ResVo modifyNotopen(ProductVo product) {
		ResVo bo = new ResVo();

		// 判断状态是否为空
		if (product.getStruts() == null) {
			bo.setSuccess(false);
			bo.setMsg("状态不能为空");
		}
		// 传入必须是 10 20 30 才能更新
		if (!product.getStruts().equals(CustomerStatus.ProductTen)
				&& !product.getStruts().equals(CustomerStatus.ProductTwenty)
				&& !product.getStruts().equals(CustomerStatus.ProductThirty)) {
			bo.setSuccess(false);
			bo.setMsg("状态无法识别");
			return bo;
		}

		Integer Notopen = productDao.modifyNotopen(product);
		if (Notopen > 0) {
			bo.setSuccess(true);
			bo.setMsg("修改陈功");
			bo.setData(product);
		}

		return bo;
	}

	/******************* 已开盘 *********************/
	public ResVo modifyAlreadyopen(ProductVo product) {
		ResVo bo = new ResVo();
		// 判断是否为空
		if (product.getStruts() == null) {
			bo.setSuccess(false);
			bo.setMsg("状态不能为空");
		}
		// 传入必须是 10 20 30 才能更新
		if (!product.getStruts().equals(CustomerStatus.ProductTen)
				&& !product.getStruts().equals(CustomerStatus.ProductTwenty)
				&& !product.getStruts().equals(CustomerStatus.ProductThirty)) {
			bo.setSuccess(false);
			bo.setMsg("状态无法识别");
			return bo;
		}
		Integer Alreadyopen = productDao.modifyAlreadyopen(product);
		if (Alreadyopen > 0) {
			bo.setSuccess(true);
			bo.setMsg("修改成功");

		}
		return bo;

	}

	/******************* 已售罄 *********************/
	public ResVo modifySoldout(ProductVo product) {
		ResVo bo = new ResVo();
		// 判断状态是否为空
		if (product.getStruts() == null) {
			bo.setSuccess(false);
			bo.setMsg("状态不能为空");
		}
		// 传入必须是 10 20 30 才能更新
		if (!product.getStruts().equals(CustomerStatus.ProductTen)
				&& !product.getStruts().equals(CustomerStatus.ProductTwenty)
				&& !product.getStruts().equals(CustomerStatus.ProductThirty)) {
			bo.setSuccess(false);
			bo.setMsg("状态无法识别");
			return bo;
		}
		Integer Soldout = productDao.modifySoldout(product);
		if (Soldout > 0) {
			bo.setSuccess(true);
			bo.setMsg("修改成功");

		}
		return bo;
	}

	@Transactional
	public ResVo modifyProduct(ModifyProductVo modifyProductVo) {
		ResVo bo = new ResVo();
		if (modifyProductVo.getProductVo().getTitle() == null) {
			bo.setMsg("标题不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getSubtitle() == null) {
			bo.setMsg("副标题不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getContent() == null) {
			bo.setMsg("内容不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getWritingTime() == null) {
			bo.setMsg("发文时间不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getUserName() == null) {
			bo.setMsg("用户不能为空");
			return bo;

		}
		if (modifyProductVo.getProductVo().getContactInformation() == null) {
			bo.setMsg("楼盘名不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getStruts() == null) {
			bo.setMsg("状态不能为空");
			return bo;
		}
		if (modifyProductVo.getProductVo().getContactInformation() == null) {
			bo.setMsg("联系信息不能为空");
			return bo;
		}
		if (modifyProductVo.getSkuVo().getPrice() == null) {
			bo.setMsg("价格不能为空");
			return bo;
		}
		if (modifyProductVo.getSkuVo().getStock() > 0) {
			bo.setMsg("库存不能为空");
			return bo;
		}
		if (modifyProductVo.getSkuVo().getFlat() > 0) {
			bo.setMsg("面积不能为空");
			return bo;
		}
		Integer modifyProduct = productDao.modifyProduct(modifyProductVo.getProductVo());
		if (modifyProduct < 1) {
			throw new RuntimeException("修改失败");
		}
		modifyProductVo.getSkuVo().setProductid(modifyProductVo.getProductVo().getProduct_id());
		Integer modifySku = skuDao.modifySku(modifyProductVo.getSkuVo());
		if (modifySku > 0) {
			bo.setMsg("修改成功");
			bo.setSuccess(true);
		} else {
			bo.setMsg("Sku修改失败");
			bo.setSuccess(false);
		}

		return bo;

	}

	/************** 添加产品——添加sku **************/
	public ResVo addProduct(ProductAndSkuBO product) {
		ResVo bo = new ResVo();

		if (product.getProductVo().getTitle() == null) {
			bo.setMsg("标题不能为空");
			return bo;
		}
		if (product.getProductVo().getSubtitle() == null) {
			bo.setMsg("副标题不能为空");
			return bo;
		}
		if (product.getProductVo().getContent() == null) {
			bo.setMsg("内容不能为空");
			return bo;
		}
		if (product.getProductVo().getWritingTime() == null) {
			bo.setMsg("发文时间不能为空");
			return bo;
		}
		if (product.getProductVo().getUserName() == null) {
			bo.setMsg("用户不能为空");
			return bo;

		}
		if (product.getProductVo().getContactInformation() == null) {
			bo.setMsg("楼盘名不能为空");
			return bo;
		}
		if (product.getProductVo().getStruts() == null) {
			bo.setMsg("状态不能为空");
			return bo;
		}
		if (product.getProductVo().getContactInformation() == null) {
			bo.setMsg("联系信息不能为空");
			return bo;
		}

		ProductVo vo = product.getProductVo();
		ProductPo addpo = new ProductPo();
		BeanUtils.copyProperties(vo, addpo);

		Integer addProduct = productDao.addProduct(addpo);
		if (addProduct < 1) {
			bo.setMsg("添加失败");
			return bo;
		}
		List<SkuVo> skuList = product.getSkuList();
		for (SkuVo skuVo : skuList) {
			skuVo.setProductid(vo.getProduct_id());

			SkuPo target = new SkuPo();
			BeanUtils.copyProperties(skuVo, target);
			Integer add = skuDao.addSku(target);
			if (add < 1) {
				throw new RuntimeException("添加失败");
			}
			bo.setMsg("添加成功");
			bo.setSuccess(true);
			bo.setData(product);
		}

		return bo;

	}

	/*
	 * 查询所有产品
	 */
	public ResVo findAll(Long customerId) {
		ResVo resvo = new ResVo();
		List<ProductVo> list = new ArrayList<ProductVo>();
		List<ProductPo> po = productDao.findAll(customerId);
		for (ProductPo p : po) {
			ProductVo vo = new ProductVo();
			BeanUtils.copyProperties(p, vo);
			list.add(vo);
		}
		resvo.setData(list);
		return resvo;
	}

	/**
	 * 区查询
	 */
	public ResVo findAllAndTheListOf(String aera) {
		ResVo resvo = new ResVo();
		List<CustomerAndProductVo> andProductVos = productDao.findAllAndTheListOf(aera);
		resvo.setData(andProductVos);
		return resvo;
	}

	/**
	 * 首页
	 */
	public ResVo customerAndProductFind() {
		ResVo resvo = new ResVo();
		List<CustomerAndProductVo> andProductVos = productDao.customerAndProductFind();
		resvo.setData(andProductVos);
		return resvo;

	}

	public ProductAndSkuVo findProductAndSku(ProductAndSkuVo productAndSkuVo) {
		ResVo resvo = new ResVo();
		ProductPo po = productDao.findProductId(productAndSkuVo.getProductVo().getProduct_id());
		ProductVo productVo = new ProductVo();
		BeanUtils.copyProperties(po, productVo);
		List<SkuPo> listskuvo = skuDao.findById(productAndSkuVo.getProductVo().getProduct_id());
		List<SkuVo> vo = new ArrayList<SkuVo>();
		BeanUtils.copyProperties(listskuvo, vo);
		productAndSkuVo.setSkuList(vo);
		productAndSkuVo.setProductVo(productVo);
		resvo.setData(productAndSkuVo);
		return productAndSkuVo;
	}

	public ResVo modifyreadthenumber(Long productId) {
		ResVo vo = new ResVo();
		Integer modifyreadthenumber = productDao.modifyreadthenumber(productId);
		if (modifyreadthenumber < 1) {
			vo.setMsg("修改失败");
			vo.setSuccess(false);
		}
		ProductPo findProductId = productDao.findProductId(productId);
		if (findProductId != null) {
			ProductVo productvo = new ProductVo();
			BeanUtils.copyProperties(findProductId, productvo);
			vo.setMsg("修改成功");
			vo.setData(productvo);
			vo.setSuccess(true);
		} else {
			vo.setMsg("失败");
			vo.setSuccess(false);
		}

		return vo;
	}

	public ResVo modifyProductAndSku(ProductAndSkuVo productAndSkuVo) {
		ResVo resvo = new ResVo();
		// 修改产品
		Integer modifyproduct = productDao.modifyProduct(productAndSkuVo.getProductVo());
		if (modifyproduct < 1) {
			resvo.setMsg("修改失败");
			resvo.setSuccess(false);
		}
		List<SkuVo> listSkuvo = productAndSkuVo.getSkuList();
		for (SkuVo skuvo : listSkuvo) {
			Integer modifysku = skuDao.modifySku(skuvo);
			if (modifysku < 1) {
				resvo.setMsg("修改成功");
				resvo.setSuccess(true);
			}
			resvo.setMsg("修改成功");
			resvo.setSuccess(true);
			resvo.setData(productAndSkuVo);
		}

		return resvo;
	}

}
