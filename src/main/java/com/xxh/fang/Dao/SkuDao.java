package com.xxh.fang.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.SkuPo;
import com.xxh.fang.entity.SkuVo;

@Repository("skudao")
public interface SkuDao {
	
	public List<SkuVo> findById(Long productid);
	
	public Integer modifySku(SkuVo skuVo);
	
	public Integer addSku(SkuPo sku);
	
	

}
