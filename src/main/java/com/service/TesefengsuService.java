package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TesefengsuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TesefengsuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TesefengsuView;


/**
 * 特色风俗
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface TesefengsuService extends IService<TesefengsuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TesefengsuVO> selectListVO(Wrapper<TesefengsuEntity> wrapper);
   	
   	TesefengsuVO selectVO(@Param("ew") Wrapper<TesefengsuEntity> wrapper);
   	
   	List<TesefengsuView> selectListView(Wrapper<TesefengsuEntity> wrapper);
   	
   	TesefengsuView selectView(@Param("ew") Wrapper<TesefengsuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TesefengsuEntity> wrapper);
   	
}

