package com.dao;

import com.entity.TesefengsuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TesefengsuVO;
import com.entity.view.TesefengsuView;


/**
 * 特色风俗
 * 
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface TesefengsuDao extends BaseMapper<TesefengsuEntity> {
	
	List<TesefengsuVO> selectListVO(@Param("ew") Wrapper<TesefengsuEntity> wrapper);
	
	TesefengsuVO selectVO(@Param("ew") Wrapper<TesefengsuEntity> wrapper);
	
	List<TesefengsuView> selectListView(@Param("ew") Wrapper<TesefengsuEntity> wrapper);

	List<TesefengsuView> selectListView(Pagination page,@Param("ew") Wrapper<TesefengsuEntity> wrapper);
	
	TesefengsuView selectView(@Param("ew") Wrapper<TesefengsuEntity> wrapper);
	
}
