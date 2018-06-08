package com.xxh.fang.Service;

import java.util.Map;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikeVo;

public interface CommentService {

	public ResVo sentimentHigh();

	public ResVo newest();

	public ResVo earliest();

	public ResVo addComment(CommentVo commentVo);

	public ResVo updatePointOfpraise(CommentVo commentVo);

	public ResVo addGivealike(GivealikeVo givealikevo);

	public Map<String, Object> FocusOn(Long customerId);
}
