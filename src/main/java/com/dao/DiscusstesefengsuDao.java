package com.dao;

import com.entity.DiscusstesefengsuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstesefengsuVO;
import com.entity.view.DiscusstesefengsuView;


/**
 * 特色风俗评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface DiscusstesefengsuDao extends BaseMapper<DiscusstesefengsuEntity> {
	
	List<DiscusstesefengsuVO> selectListVO(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
	
	DiscusstesefengsuVO selectVO(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
	
	List<DiscusstesefengsuView> selectListView(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);

	List<DiscusstesefengsuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
	
	DiscusstesefengsuView selectView(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
	
}
