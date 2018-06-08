package com.xxh.fang.api;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxh.fang.Service.GivealikeService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.GivealikeVo;

@Service
public class GivealikeApiImpl implements GivealikeApi {

	@Resource
	GivealikeService givealikeService;

	public ResVo addGivealike(GivealikeVo givealikevo) {
		return givealikeService.addGivealike(givealikevo);
	}

	public Map<String, Object> findlike(Long customerId) {
		return givealikeService.findlike(customerId);
	}

	public Long findlikeFocuson(Long customerId) {
		return givealikeService.findlikeFocuson(customerId);
	}

}
