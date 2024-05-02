package com.entity.vo;

import com.entity.TesefengsuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 特色风俗
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public class TesefengsuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 风俗介绍
	 */
	
	private String fengsujieshao;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 风俗详情
	 */
	
	private String fengsuxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：风俗介绍
	 */
	 
	public void setFengsujieshao(String fengsujieshao) {
		this.fengsujieshao = fengsujieshao;
	}
	
	/**
	 * 获取：风俗介绍
	 */
	public String getFengsujieshao() {
		return fengsujieshao;
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
	 * 设置：风俗详情
	 */
	 
	public void setFengsuxiangqing(String fengsuxiangqing) {
		this.fengsuxiangqing = fengsuxiangqing;
	}
	
	/**
	 * 获取：风俗详情
	 */
	public String getFengsuxiangqing() {
		return fengsuxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
