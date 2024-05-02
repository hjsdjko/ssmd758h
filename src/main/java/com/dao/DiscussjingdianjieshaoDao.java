package com.dao;

import com.entity.DiscussjingdianjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingdianjieshaoVO;
import com.entity.view.DiscussjingdianjieshaoView;


/**
 * 景点介绍评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface DiscussjingdianjieshaoDao extends BaseMapper<DiscussjingdianjieshaoEntity> {
	
	List<DiscussjingdianjieshaoVO> selectListVO(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
	
	DiscussjingdianjieshaoVO selectVO(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
	
	List<DiscussjingdianjieshaoView> selectListView(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);

	List<DiscussjingdianjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
	
	DiscussjingdianjieshaoView selectView(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
	
}
