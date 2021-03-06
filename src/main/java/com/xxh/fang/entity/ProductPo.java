package com.xxh.fang.entity;

import java.util.Date;

public class ProductPo {

	/**
	 * 产品Id
	 */
	public Long product_id;
	/**
	 * 标题
	 */
	public String title;
	/**
	 * 副标题
	 */
	public String subtitle;
	/**
	 * 内容
	 */
	public String content;
	/**
	 * 发文时间
	 */
	public Date writingTime;
	/**
	 * 用户
	 */
	public String userName;
	/**
	 * 主图
	 */
	public String masterGraph;
	/**
	 * 省
	 */
	public String province;
	/**
	 * 城市
	 */
	public String city;
	/**
	 * 区
	 */
	public String area;
	/**
	 * 详细地址
	 */
	public String address;
	/**
	 * 楼盘名
	 */
	public String realEstateName;
	/**
	 * 状态-10未开盘-20已开盘-30已售罄
	 */
	public Integer struts;
	/**
	 * 联系信息
	 */
	public String contactInformation;
	/**
	 * 周边
	 */
	public String periphery;

	/**
	 * 阅读数
	 */
	public Long readthenumber;
	/**
	 * 用户id
	 */
	public Long customerId;

	public ProductPo() {
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getReadthenumber() {
		return readthenumber;
	}

	public void setReadthenumber(Long readthenumber) {
		this.readthenumber = readthenumber;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWritingTime() {
		return writingTime;
	}

	public void setWritingTime(Date writingTime) {
		this.writingTime = writingTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMasterGraph() {
		return masterGraph;
	}

	public void setMasterGraph(String masterGraph) {
		this.masterGraph = masterGraph;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRealEstateName() {
		return realEstateName;
	}

	public void setRealEstateName(String realEstateName) {
		this.realEstateName = realEstateName;
	}

	public Integer getStruts() {
		return struts;
	}

	public void setStruts(Integer struts) {
		this.struts = struts;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getPeriphery() {
		return periphery;
	}

	public void setPeriphery(String periphery) {
		this.periphery = periphery;
	}

	public String toString() {
		return "ProductPo [productid=" + product_id + ",customerId=" + customerId + ", title=" + title + ", subtitle="
				+ subtitle + ", content=" + content + ", writingTime=" + writingTime + ", userName=" + userName
				+ ", masterGraph=" + masterGraph + ", province=" + province + ", city=" + city + ", area=" + area
				+ ", address=" + address + ", realEstateName=" + realEstateName + ", struts=" + struts
				+ ", contactInformation=" + contactInformation + ", periphery=" + periphery + "]";
	}

}
