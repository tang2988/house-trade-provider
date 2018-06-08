package com.xxh.fang.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xxh.fang.Dao.CommentDao;
import com.xxh.fang.Dao.GivealikeDao;
import com.xxh.fang.Service.CommentService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentAndCustomerVo;
import com.xxh.fang.entity.CommentPo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikePo;
import com.xxh.fang.entity.GivealikeVo;

@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService {

	@Resource
	CommentDao commentDao;

	@Resource
	GivealikeDao givealikeDao;

	public ResVo sentimentHigh() {
		ResVo resvo = new ResVo();
		List<CommentAndCustomerVo> po = commentDao.sentimentHigh();
		resvo.setData(po);

		return resvo;
	}

	public ResVo newest() {
		ResVo resvo = new ResVo();

		List<CommentAndCustomerVo> newest = commentDao.newest();
		resvo.setData(newest);
		return resvo;
	}

	public ResVo earliest() {
		ResVo resvo = new ResVo();

		List<CommentAndCustomerVo> Earliest = commentDao.earliest();
		resvo.setData(Earliest);
		return resvo;
	}

	public ResVo addComment(CommentVo commentVo) {
		ResVo resVo = new ResVo();
		if (commentVo.getProduct_id() == null) {
			resVo.setMsg("产品ID不能为空");
			resVo.setSuccess(false);
		}

		if (commentVo.getContent() == null) {
			resVo.setMsg("评论内容不能为空");
			resVo.setSuccess(false);
		}
		if (commentVo.getCustomerId() == null) {
			resVo.setMsg("评论人不能为空");
			resVo.setSuccess(false);
		}
		CommentPo po = new CommentPo();
		BeanUtils.copyProperties(commentVo, po);

		int eff = commentDao.addComment(po);
		if (eff > 0) {
			BeanUtils.copyProperties(po, commentVo);
			resVo.setMsg("添加成功");
			resVo.setSuccess(true);
			resVo.setData(commentVo);
		} else {
			resVo.setMsg("添加失败");
			resVo.setSuccess(false);
		}
		return resVo;
	}

	public ResVo updatePointOfpraise(CommentVo commentVo) {
		ResVo vo = new ResVo();
		int updatePointOfpraise = commentDao.updatePointOfpraise(commentVo);
		if (updatePointOfpraise < 1) {
			vo.setData("添加失败");
			vo.setSuccess(false);
		}
		CommentPo findByID = commentDao.findBycommentOnID(commentVo.getCommentOnID());
		if (findByID != null) {

			BeanUtils.copyProperties(findByID, commentVo);
			vo.setData(commentVo);
			vo.setSuccess(true);
			vo.setMsg("点赞成功");
		} else {
			vo.setData("点赞失败");
			vo.setSuccess(false);
		}
		return vo;
	}

	public ResVo addGivealike(GivealikeVo givealikevo) {
		ResVo vo = new ResVo();
		GivealikePo po = new GivealikePo();
		BeanUtils.copyProperties(givealikevo, po);
		Integer add = givealikeDao.addGivealike(po);
		if (add > 0) {
			BeanUtils.copyProperties(po, givealikevo);
			vo.setData(givealikevo);
			vo.setMsg("添加成功");
			vo.setSuccess(false);
		} else {
			vo.setMsg("添加失败");
			vo.setSuccess(false);
		}
		return vo;
	}

	public Map<String, Object> FocusOn(Long customerId) {
		return commentDao.FocusOn(customerId);
	}

}
