package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjingdianjieshaoDao;
import com.entity.DiscussjingdianjieshaoEntity;
import com.service.DiscussjingdianjieshaoService;
import com.entity.vo.DiscussjingdianjieshaoVO;
import com.entity.view.DiscussjingdianjieshaoView;

@Service("discussjingdianjieshaoService")
public class DiscussjingdianjieshaoServiceImpl extends ServiceImpl<DiscussjingdianjieshaoDao, DiscussjingdianjieshaoEntity> implements DiscussjingdianjieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingdianjieshaoEntity> page = this.selectPage(
                new Query<DiscussjingdianjieshaoEntity>(params).getPage(),
                new EntityWrapper<DiscussjingdianjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingdianjieshaoEntity> wrapper) {
		  Page<DiscussjingdianjieshaoView> page =new Query<DiscussjingdianjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingdianjieshaoVO> selectListVO(Wrapper<DiscussjingdianjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingdianjieshaoVO selectVO(Wrapper<DiscussjingdianjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingdianjieshaoView> selectListView(Wrapper<DiscussjingdianjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingdianjieshaoView selectView(Wrapper<DiscussjingdianjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
