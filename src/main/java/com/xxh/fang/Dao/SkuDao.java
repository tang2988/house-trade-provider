package com.xxh.fang.Dao;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.SkuPo;
import com.xxh.fang.entity.SkuVo;

@Repository("skudao")
public interface SkuDao {
	
	public SkuPo findById(Long skuid);
	
	public Integer modifySku(SkuVo skuVo);
	
	public Integer addSku(SkuPo sku);
	
	

}
