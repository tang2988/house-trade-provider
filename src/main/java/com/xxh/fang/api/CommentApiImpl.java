package com.xxh.fang.api;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxh.fang.Service.CommentService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikeVo;

@Service
public class CommentApiImpl implements CommentApi {

	@Resource
	CommentService commentServiceImpl;

	public List<CommentVo> sentimentHigh() {
		return commentServiceImpl.sentimentHigh();
	}

	public List<CommentVo> newest() {
		return commentServiceImpl.newest();
	}

	public List<CommentVo> earliest() {
		return commentServiceImpl.earliest();
	}

	public ResVo addComment(CommentVo commentVo) {

		return commentServiceImpl.addComment(commentVo);
	}

	public ResVo updatePointOfpraise(CommentVo commentVo) {
		return commentServiceImpl.updatePointOfpraise(commentVo);
	}

	public Integer addGivealike(GivealikeVo givealikeVo) {
		return commentServiceImpl.addGivealike(givealikeVo);
	}

}
