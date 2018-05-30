package com.xxh.fang.Service;

import java.util.List;
import java.util.Map;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CustomerAndProductVo;
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
	public List<ProductVo> findAll();

	/**
	 *区查询
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> findAllAndTheListOf(String aera);

	/**
	 * 用户产品表
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> customerAndProductFind();
	
	/**
	 * 产品id查询
	 */
	public List<Map<String, Object>> findProductId(ProductAndSkuVo productAndSkuvo);

}
