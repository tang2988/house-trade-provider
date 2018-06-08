package com.xxh.fang.ServiceImpl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.xxh.fang.Dao.GivealikeDao;
import com.xxh.fang.Service.GivealikeService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.GivealikePo;
import com.xxh.fang.entity.GivealikeVo;

@Service("givealikeService")
public class GivealikeServiceImpl implements GivealikeService {

	@Resource
	GivealikeDao givealikeDao;

	public ResVo addGivealike(GivealikeVo givealikevo) {
		ResVo vo = new ResVo();
		GivealikePo po = new GivealikePo();
		BeanUtils.copyProperties(givealikevo, po);
		 Integer add = givealikeDao.addGivealike(po);
		 if(add>0){
			 vo.setData(givealikevo);
			 vo.setMsg("添加成功");
			 vo.setSuccess(true);
		 }else{
			 vo.setMsg("添加失败");
			 vo.setSuccess(false);
		 }
		return vo;
	}

	public Map<String, Object> findlike(Long customerId) {
		return givealikeDao.findlike(customerId);
	}

	public Long findlikeFocuson(Long customerId) {
		return givealikeDao.findlikeFocuson(customerId);
	}

}
