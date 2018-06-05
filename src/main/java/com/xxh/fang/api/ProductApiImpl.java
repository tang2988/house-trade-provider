package com.xxh.fang.api;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxh.fang.Service.ProductService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductVo;

@Service
public class ProductApiImpl implements ProductApi {

	@Resource
	ProductService productService;

	public List<ProductVo> findAll() {

		return productService.findAll();
	}

	/**
	 * 区查询
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> findAllAndTheListOf(String aera) {

		return productService.findAllAndTheListOf(aera);
	}

	/**
	 * 首页
	 */
	public List<CustomerAndProductVo> customerAndProductFind() {
		return productService.customerAndProductFind();
	}

	/**
	 * 产品和sku表
	 */
	public ProductAndSkuVo findProductAndSku(ProductAndSkuVo productAndSkuVo) {
		return productService.findProductAndSku(productAndSkuVo);

	}

	/**
	 * 阅读数
	 */
	public ResVo modifyreadthenumber(Long productId) {
		return productService.modifyreadthenumber(productId);
	}

}
