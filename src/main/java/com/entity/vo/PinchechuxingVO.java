package com.entity.vo;

import com.entity.PinchechuxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 拼车出行
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public class PinchechuxingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 空位置数
	 */
	
	private String kongweizhishu;
		
	/**
	 * 出发时间
	 */
	
	private String chufashijian;
		
	/**
	 * 出发地点
	 */
	
	private String chufadidian;
		
	/**
	 * 人均价格
	 */
	
	private String renjunjiage;
		
	/**
	 * 发起人
	 */
	
	private String faqiren;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
		
	/**
	 * 经度
	 */
	
	private Float longitude;
		
	/**
	 * 纬度
	 */
	
	private Float latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：空位置数
	 */
	 
	public void setKongweizhishu(String kongweizhishu) {
		this.kongweizhishu = kongweizhishu;
	}
	
	/**
	 * 获取：空位置数
	 */
	public String getKongweizhishu() {
		return kongweizhishu;
	}
				
	
	/**
	 * 设置：出发时间
	 */
	 
	public void setChufashijian(String chufashijian) {
		this.chufashijian = chufashijian;
	}
	
	/**
	 * 获取：出发时间
	 */
	public String getChufashijian() {
		return chufashijian;
	}
				
	
	/**
	 * 设置：出发地点
	 */
	 
	public void setChufadidian(String chufadidian) {
		this.chufadidian = chufadidian;
	}
	
	/**
	 * 获取：出发地点
	 */
	public String getChufadidian() {
		return chufadidian;
	}
				
	
	/**
	 * 设置：人均价格
	 */
	 
	public void setRenjunjiage(String renjunjiage) {
		this.renjunjiage = renjunjiage;
	}
	
	/**
	 * 获取：人均价格
	 */
	public String getRenjunjiage() {
		return renjunjiage;
	}
				
	
	/**
	 * 设置：发起人
	 */
	 
	public void setFaqiren(String faqiren) {
		this.faqiren = faqiren;
	}
	
	/**
	 * 获取：发起人
	 */
	public String getFaqiren() {
		return faqiren;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
