package com.xxh.fang.api;

import java.util.Map;

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

	public ResVo sentimentHigh() {
		return commentServiceImpl.sentimentHigh();
	}

	public ResVo newest() {
		return commentServiceImpl.newest();
	}

	public ResVo earliest() {
		return commentServiceImpl.earliest();
	}

	public ResVo addComment(CommentVo commentVo) {

		return commentServiceImpl.addComment(commentVo);
	}

	public ResVo updatePointOfpraise(CommentVo commentVo) {
		return commentServiceImpl.updatePointOfpraise(commentVo);
	}

	public ResVo addGivealike(GivealikeVo givealikevo) {
		return commentServiceImpl.addGivealike(givealikevo);
	}

	public Map<String, Object> FocusOn(Long customerId) {
		return commentServiceImpl.FocusOn(customerId);
	}

}
