package com.xxh.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxh.fang.ServiceImpl.ProductServiceImpl;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ModifyProductVo;
import com.xxh.fang.entity.ProductAndSkuBO;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductPo;
import com.xxh.fang.entity.ProductVo;
import com.xxh.fang.entity.SkuVo;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" }) // 加载配置文件
public class ProductServiceTest {

	@Resource
	ProductServiceImpl productServiceImpl;

	@Test
	public void modifyNotopen() {
		ProductVo productvo = new ProductVo();
		productvo.setProductid(1L);
		productvo.setStruts(20);
		ResVo Notopen = productServiceImpl.modifyNotopen(productvo);
		System.out.println(Notopen);
	}

	@Test
	public void modifyAlreadyopen() {
		ProductVo productvo = new ProductVo();
		productvo.setProductid(1L);
		productvo.setStruts(40);
		ResVo readyopen = productServiceImpl.modifyAlreadyopen(productvo);
		System.out.println(readyopen);
	}

	@Test
	public void modifySoldout() {
		ProductVo productvo = new ProductVo();
		productvo.setProductid(1L);
		productvo.setStruts(30);
		ResVo Soldout = productServiceImpl.modifySoldout(productvo);
		System.out.println(Soldout);
	}

	@Test
	public void addProduct() {
		ProductAndSkuBO bo = new ProductAndSkuBO();
		ProductVo productvo = new ProductVo();
		List<SkuVo> skuList = new ArrayList<SkuVo>();
		SkuVo skuvo = new SkuVo();
		skuvo.setProductid(productvo.getProductid());
		skuvo.setFlat(120);
		skuvo.setPrice(new BigDecimal(12000000));
		skuvo.setStock(120);
		skuvo.setTypeOfHouse("二室一厅");

		SkuVo poTwo = new SkuVo();
		poTwo.setProductid(productvo.getProductid());
		poTwo.setFlat(140);
		poTwo.setPrice(new BigDecimal(22000000));
		poTwo.setStock(120);
		poTwo.setTypeOfHouse("三室室一厅");
		skuList.add(skuvo);
		skuList.add(poTwo);
		bo.setSkuList(skuList);

		bo.setProductVo(productvo);
		productvo.setArea("盐田123");
		productvo.setAddress("西二坊");
		productvo.setCity("深圳市");
		productvo.setContactInformation("15128456451");
		productvo.setContent("123456");
		productvo.setMasterGraph("xxxxh");
		productvo.setPeriphery("白石洲");
		productvo.setProvince("广东省");
		productvo.setRealEstateName("三海城");
		productvo.setStruts(10);
		productvo.setSubtitle("房子2");
		productvo.setTitle("房子");
		productvo.setUserName("谢雄辉辉");
		productvo.setWritingTime(new Date());

		ResVo aa = productServiceImpl.addProduct(bo);
		System.out.println(aa);
	}

	@Test
	public void modifyProduct() {
		ModifyProductVo modifyProductVo = new ModifyProductVo();
		ProductVo productvo = new ProductVo();

		SkuVo skuvo = new SkuVo();

		skuvo.setFlat(120);
		skuvo.setPrice(new BigDecimal(22000000));
		skuvo.setStock(120);
		skuvo.setTypeOfHouse("二室一厅");
		skuvo.setSkuid(15L);
		skuvo.setProductid(20L);
		modifyProductVo.setSkuVo(skuvo);
		/*
		 * SkuPo poTwo = new SkuPo();
		 * 
		 * poTwo.setFlat(140); poTwo.setProductid(productvo.getProductid());
		 * poTwo.setPrice(new BigDecimal(22000000)); poTwo.setStock(120);
		 * poTwo.setTypeOfHouse("三室一厅"); poTwo.setSkuid(13L);
		 */

		productvo.setProductid(20L);
		productvo.setArea("盐田22");
		productvo.setAddress("西二坊");
		productvo.setCity("深圳市");
		productvo.setContactInformation("15128456451");
		productvo.setContent("45678");
		productvo.setMasterGraph("xxxxh");
		productvo.setPeriphery("白石洲");
		productvo.setProvince("广东省");
		productvo.setRealEstateName("三海城");
		productvo.setStruts(10);
		productvo.setSubtitle("房子2");
		productvo.setTitle("房子");
		productvo.setUserName("myname");
		productvo.setWritingTime(new Date());
		modifyProductVo.setProductVo(productvo);

		ResVo aa = productServiceImpl.modifyProduct(modifyProductVo);
		System.out.println(aa);
	}

	@Test
	public void findAll() {
		 List<ProductVo> b = productServiceImpl.findAll();
		System.out.println(b);
	}

	@Test
	public void aera() {
		List<CustomerAndProductVo> b = productServiceImpl.findAllAndTheListOf("盐田区");
		System.out.println(b);

	}

	@Test
	public void findProductId() {
		ProductAndSkuVo productAndSkuvo = new ProductAndSkuVo();
		productAndSkuvo.setProduct_id(20L);
		List<Map<String, Object>> b = productServiceImpl.findProductId(productAndSkuvo);
		System.out.println(b);
	}
}
