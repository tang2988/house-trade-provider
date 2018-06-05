package com.xxh.Test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxh.fang.Service.CommentService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class CommentTest {
	
	@Resource
	CommentService commentServiceImpl;
	
	@Test
	public void sendHigh(){
		
		 List<CommentVo> b = commentServiceImpl.sentimentHigh(); 
		 System.out.println(b);
	}
	@Test
	public void addcomment(){
		CommentVo commentVo = new CommentVo();
		commentVo.setContent("谢雄辉nihao");
		commentVo.setCommentOnPeople("谢雄辉");
		commentVo.setProduct_id(21L);
		commentVo.setRepostId(5L);
		commentVo.setCommentOfTime(new Date());
		commentServiceImpl.addComment(commentVo );
		
	}
	@Test
	public void upda(){
		CommentVo commentVo = new CommentVo();
		commentVo.setCommentOnID(3L);
		
		 ResVo b = commentServiceImpl.updatePointOfpraise(commentVo);
		 System.out.println(b);
	}
	
	
	

}
