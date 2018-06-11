package com.xxh.fang.Service;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.ModifyProductVo;
import com.xxh.fang.entity.ProductAndSkuBO;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductVo;

public interface ProductService {
	/**
	 * 修改状态-10未开盘
	 * 
	 * @param product
	 * @return
	 */
	public ResVo modifyNotopen(ProductVo product);

	/**
	 * 修改状态-20已开盘
	 * 
	 * @param product
	 * @return
	 */
	public ResVo modifyAlreadyopen(ProductVo product);

	/**
	 * 修改状态-30已售罄
	 * 
	 * @param product
	 * @return
	 */
	public ResVo modifySoldout(ProductVo product);

	/**
	 * 修改全部
	 */
	public ResVo modifyProduct(ModifyProductVo modifyProductVo);

	/**
	 * 添加产品
	 */
	public ResVo addProduct(ProductAndSkuBO andSkuBO);

	/**
	 * 查询产品所有
	 */
	public ResVo findAll(Long customerId);

	/**
	 * 区查询
	 * 
	 * @return
	 */
	public ResVo findAllAndTheListOf(String aera);

	/**
	 * 用户产品表
	 * 
	 * @return
	 */
	public ResVo customerAndProductFind();

	/**
	 * 产品id查询
	 */
	public ProductAndSkuVo findProductAndSku(ProductAndSkuVo productAndSkuVo);

	/**
	 * 閲讀數
	 * 
	 * @param productId
	 * @return
	 */
	public ResVo modifyreadthenumber(Long productId);

	public ResVo modifyProductAndSku(ProductAndSkuVo productAndSkuVo);
}
