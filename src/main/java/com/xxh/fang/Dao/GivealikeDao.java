package com.xxh.fang.Dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.GivealikePo;
import com.xxh.fang.entity.GivealikeVo;

@Repository
public interface GivealikeDao {

	public Integer addGivealike(GivealikePo givealikepo);

	public Map<String, Object> findlike(Long customerId);

	public Long findlikeFocuson(Long customerId);

}
