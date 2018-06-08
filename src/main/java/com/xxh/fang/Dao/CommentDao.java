package com.xxh.fang.Dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.CommentAndCustomerVo;
import com.xxh.fang.entity.CommentPo;
import com.xxh.fang.entity.CommentVo;

@Repository
public interface CommentDao {

	public List<CommentAndCustomerVo> sentimentHigh();

	public List<CommentAndCustomerVo> newest();

	public List<CommentAndCustomerVo> earliest();

	public int updatePointOfpraise(CommentVo commentVo);

	public CommentPo findBycommentOnID(Long commentOnID);

	public Map<String, Object> FocusOn(Long customerId);

	public int addComment(CommentPo po);

}
