package com.xxh.fang.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProductAndSkuPo implements Serializable {

	public static final long serialVersionUID = 5418353580174388320L;

	public Long product_id;
	public String title;
	public String subtitle;
	public Date writingTime;
	public String content;
	public String address;
	public BigDecimal price;

	public ProductAndSkuPo() {
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Date getWritingTime() {
		return writingTime;
	}

	public void setWritingTime(Date writingTime) {
		this.writingTime = writingTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductAndSkuPo [product_id=" + product_id + ", title=" + title + ", subtitle=" + subtitle
				+ ", writingTime=" + writingTime + ", content=" + content + ", address=" + address + ", price=" + price
				+ "]";
	}

	
}
