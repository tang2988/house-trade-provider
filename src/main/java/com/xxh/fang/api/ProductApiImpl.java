package com.xxh.fang.api;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxh.fang.Service.ProductService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.ProductAndSkuBO;
import com.xxh.fang.entity.ProductAndSkuVo;

@Service
public class ProductApiImpl implements ProductApi {

	@Resource
	ProductService productService;


	public ResVo findAll(Long customerId) {
		 return productService.findAll(customerId);
	}

	/**
	 * 区查询
	 * 
	 * @return
	 */
	public ResVo findAllAndTheListOf(String aera) {

		return productService.findAllAndTheListOf(aera);
	}

	/**
	 * 首页
	 */
	public ResVo customerAndProductFind() {
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

	public ResVo addProduct(ProductAndSkuBO product) {
		return productService.addProduct(product);
	}

	

}
