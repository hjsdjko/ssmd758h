package com.entity.view;

import com.entity.DiscussjingdianjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 景点介绍评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
@TableName("discussjingdianjieshao")
public class DiscussjingdianjieshaoView  extends DiscussjingdianjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingdianjieshaoView(){
	}
 
 	public DiscussjingdianjieshaoView(DiscussjingdianjieshaoEntity discussjingdianjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingdianjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
