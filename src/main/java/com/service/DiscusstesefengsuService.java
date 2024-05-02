package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstesefengsuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstesefengsuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstesefengsuView;


/**
 * 特色风俗评论表
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface DiscusstesefengsuService extends IService<DiscusstesefengsuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstesefengsuVO> selectListVO(Wrapper<DiscusstesefengsuEntity> wrapper);
   	
   	DiscusstesefengsuVO selectVO(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
   	
   	List<DiscusstesefengsuView> selectListView(Wrapper<DiscusstesefengsuEntity> wrapper);
   	
   	DiscusstesefengsuView selectView(@Param("ew") Wrapper<DiscusstesefengsuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstesefengsuEntity> wrapper);
   	
}

