package com.xxh.Test;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxh.fang.Service.CommentService;
import com.xxh.fang.Service.GivealikeService;
import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikeVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class CommentTest {

	@Resource
	CommentService commentServiceImpl;

	@Resource
	GivealikeService givealikeService;
	@Test
	public void sendHigh() {

		 ResVo b = commentServiceImpl.sentimentHigh();
		System.out.println(b);
	}

	@Test
	public void addcomment() {
		CommentVo commentVo = new CommentVo();
		commentVo.setContent("谢雄辉nihao");

		commentVo.setProduct_id(221L);
		commentVo.setCommentOfTime(new Date());
		commentVo.setPointOfpraise(10L);
		 ResVo b = commentServiceImpl.addComment(commentVo);
		 System.out.println(b);

	}

	@Test
	public void upda() {
		CommentVo commentVo = new CommentVo();
		commentVo.setCommentOnID(3L);

		ResVo b = commentServiceImpl.updatePointOfpraise(commentVo);
		System.out.println(b);
	}
	
	@Test
	public void count(){
	 Map<String, Object> b = givealikeService.findlike(1010000023811L);
		b.get("customerId");
		 System.out.println(b);
	}
	@Test()
	public void give(){
		GivealikeVo givealikevo= new GivealikeVo();
		givealikevo.setPointOfTime(new Date());
		givealikevo.setProduct_id(1L);
		givealikevo.setStatus(10);
		givealikevo.setCustomerId(1L);
		 ResVo b = commentServiceImpl.addGivealike(givealikevo);
		System.out.println(b);
	}

}
