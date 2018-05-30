package com.xxh.Test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 使用junit4进行测试
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" }) // 加载配置文件
public class SkuServiceTest {

//	@Resource
//	SkuServiceImpl serviceImpl;
//
//	@Test
//	  public void modifySku() {
//		  ProductAndSkuBO andSkuBO = new ProductAndSkuBO();
//		  andSkuBO.setProductid(3L);
//		  andSkuBO.setTypeOfHouse("三室二厅");
//		  andSkuBO.setStock(120);
//		  andSkuBO.setPrice(new BigDecimal(20000020));
//		  andSkuBO.setFlat(150);
//		  andSkuBO.setSkuid(3L);
//		   Integer modifySku = serviceImpl.modifySku(andSkuBO);
//		   System.out.println(modifySku);
//		  }
//	 
//	@Test
//	public void addSku() {
//		Sku sku = new Sku();
//		sku.setFlat(100);
//		sku.setPrice(new BigDecimal(1000000));
//		sku.setProductid(1L);
//		sku.setStock(100);
//		sku.setTypeOfHouse("三室一厅");
//		 Integer addSku = serviceImpl.addSku(sku);
//		 System.out.println(addSku);
//	}

}
