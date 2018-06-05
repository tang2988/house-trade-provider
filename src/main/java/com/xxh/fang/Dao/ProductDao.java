package com.xxh.fang.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.CustomerAndProductVo;
import com.xxh.fang.entity.ProductAndSkuVo;
import com.xxh.fang.entity.ProductPo;
import com.xxh.fang.entity.ProductVo;

@Repository
public interface ProductDao {
	/**
	 * 修改状态-10未开盘
	 * 
	 * @param product
	 * @return
	 */
	public Integer modifyNotopen(ProductVo product);

	/**
	 * 修改状态-20已开盘
	 * 
	 * @param product
	 * @return
	 */
	public Integer modifyAlreadyopen(ProductVo product);

	/**
	 * 修改状态-30已售罄
	 * 
	 * @param product
	 * @return
	 */
	public Integer modifySoldout(ProductVo product);

	/**
	 * 修改全部
	 */
	public Integer modifyProduct(ProductVo productVo);

	/**
	 * 添加产品
	 */
	public Integer addProduct(ProductVo product);

	/**
	 * 查询所有
	 */
	public List<ProductPo> findAll();

	/**
	 * 区查询
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> findAllAndTheListOf(String area);

	/**
	 * 首页
	 * 
	 * @return
	 */
	public List<CustomerAndProductVo> customerAndProductFind();

	/**
	 * 产品id查询
	 */
	public ProductVo findProductId(Long productId);
	
	public Integer modifyreadthenumber(Long productId);
	

}
