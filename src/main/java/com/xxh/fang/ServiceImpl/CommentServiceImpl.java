package com.xxh.fang.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xxh.fang.Dao.CommentDao;
import com.xxh.fang.Dao.GivealikeDao;
import com.xxh.fang.Service.CommentService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentPo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikeVo;

@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService {

	@Resource
	CommentDao commentDao;

	@Resource
	GivealikeDao givealikeDao;

	public List<CommentVo> sentimentHigh() {
		List<CommentVo> list = new ArrayList<CommentVo>();
		List<CommentPo> po = commentDao.sentimentHigh();
		for (CommentPo p : po) {
			CommentVo vo = new CommentVo();
			BeanUtils.copyProperties(p, vo);
			list.add(vo);
		}

		return list;
	}

	public List<CommentVo> newest() {
		List<CommentVo> list = new ArrayList<CommentVo>();
		List<CommentPo> newest = commentDao.newest();
		for (CommentPo po : newest) {
			CommentVo vo = new CommentVo();
			BeanUtils.copyProperties(po, vo);
			list.add(vo);
		}
		return list;
	}

	public List<CommentVo> earliest() {
		List<CommentVo> list = new ArrayList<CommentVo>();
		List<CommentPo> Earliest = commentDao.earliest();
		for (CommentPo po : Earliest) {
			CommentVo vo = new CommentVo();
			BeanUtils.copyProperties(po, vo);
			list.add(vo);
		}
		return list;
	}

	public ResVo addComment(CommentVo commentVo) {
		ResVo resVo = new ResVo();
		if (commentVo.getProduct_id() == null) {
			resVo.setMsg("产品ID不能为空");
			resVo.setSuccess(false);
		}
		if (commentVo.getRepostId() == null) {
			resVo.setMsg("回帖ID不能为空");
			resVo.setSuccess(false);
		}
		if (commentVo.getContent() == null) {
			resVo.setMsg("评论内容不能为空");
			resVo.setSuccess(false);
		}
		if (commentVo.getCommentOnPeople() == null) {
			resVo.setMsg("评论人不能为空");
			resVo.setSuccess(false);
		}
		int addComment = commentDao.addComment(commentVo);
		if (addComment > 1) {
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
			vo.setData(findByID);
			vo.setSuccess(true);
			vo.setMsg("成功");
		} else {
			vo.setData("失败");
			vo.setSuccess(false);
		}
		return vo;
	}

	public Integer addGivealike(GivealikeVo givealikeVo) {

		return givealikeDao.addGivealike(givealikeVo);
	}

}
