package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特色风俗
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
@TableName("tesefengsu")
public class TesefengsuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TesefengsuEntity() {
		
	}
	
	public TesefengsuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 风俗名称
	 */
					
	private String fengsumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：风俗名称
	 */
	public void setFengsumingcheng(String fengsumingcheng) {
		this.fengsumingcheng = fengsumingcheng;
	}
	/**
	 * 获取：风俗名称
	 */
	public String getFengsumingcheng() {
		return fengsumingcheng;
	}
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
