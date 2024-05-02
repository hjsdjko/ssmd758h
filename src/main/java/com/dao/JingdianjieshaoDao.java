package com.dao;

import com.entity.JingdianjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingdianjieshaoVO;
import com.entity.view.JingdianjieshaoView;


/**
 * 景点介绍
 * 
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface JingdianjieshaoDao extends BaseMapper<JingdianjieshaoEntity> {
	
	List<JingdianjieshaoVO> selectListVO(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
	
	JingdianjieshaoVO selectVO(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
	
	List<JingdianjieshaoView> selectListView(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);

	List<JingdianjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
	
	JingdianjieshaoView selectView(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
	
}
