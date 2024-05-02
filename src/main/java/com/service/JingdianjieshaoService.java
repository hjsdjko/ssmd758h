package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingdianjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianjieshaoView;


/**
 * 景点介绍
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
public interface JingdianjieshaoService extends IService<JingdianjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingdianjieshaoVO> selectListVO(Wrapper<JingdianjieshaoEntity> wrapper);
   	
   	JingdianjieshaoVO selectVO(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
   	
   	List<JingdianjieshaoView> selectListView(Wrapper<JingdianjieshaoEntity> wrapper);
   	
   	JingdianjieshaoView selectView(@Param("ew") Wrapper<JingdianjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingdianjieshaoEntity> wrapper);
   	
}

