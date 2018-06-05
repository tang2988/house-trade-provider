package com.xxh.fang.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xxh.fang.entity.CommentPo;
import com.xxh.fang.entity.CommentVo;

@Repository
public interface CommentDao {
	
	 public List<CommentPo> sentimentHigh();
	 
	 public List<CommentPo> newest();
	 
	 public List<CommentPo> earliest();
	 
	 public int addComment(CommentVo commentVo);
	 
	 public int updatePointOfpraise(CommentVo commentVo);
	 
	 public CommentPo findBycommentOnID(Long commentOnID);

}
