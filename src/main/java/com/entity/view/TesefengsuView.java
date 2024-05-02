package com.entity.view;

import com.entity.TesefengsuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特色风俗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
@TableName("tesefengsu")
public class TesefengsuView  extends TesefengsuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TesefengsuView(){
	}
 
 	public TesefengsuView(TesefengsuEntity tesefengsuEntity){
 	try {
			BeanUtils.copyProperties(this, tesefengsuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
