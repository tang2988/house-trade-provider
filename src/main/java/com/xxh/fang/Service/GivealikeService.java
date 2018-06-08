package com.xxh.fang.Service;

import java.util.Map;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.GivealikePo;
import com.xxh.fang.entity.GivealikeVo;

public interface GivealikeService {

	public ResVo addGivealike(GivealikeVo givealikevo);

	public Map<String, Object> findlike(Long customerId);

	public Long findlikeFocuson(Long customerId);

}
