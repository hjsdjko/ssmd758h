package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingdianjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingdianjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingdianjieshaoView;


/**
 * 景点介绍评论表
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface DiscussjingdianjieshaoService extends IService<DiscussjingdianjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingdianjieshaoVO> selectListVO(Wrapper<DiscussjingdianjieshaoEntity> wrapper);
   	
   	DiscussjingdianjieshaoVO selectVO(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
   	
   	List<DiscussjingdianjieshaoView> selectListView(Wrapper<DiscussjingdianjieshaoEntity> wrapper);
   	
   	DiscussjingdianjieshaoView selectView(@Param("ew") Wrapper<DiscussjingdianjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingdianjieshaoEntity> wrapper);
   	
}

