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


import com.dao.DiscusstesefengsuDao;
import com.entity.DiscusstesefengsuEntity;
import com.service.DiscusstesefengsuService;
import com.entity.vo.DiscusstesefengsuVO;
import com.entity.view.DiscusstesefengsuView;

@Service("discusstesefengsuService")
public class DiscusstesefengsuServiceImpl extends ServiceImpl<DiscusstesefengsuDao, DiscusstesefengsuEntity> implements DiscusstesefengsuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstesefengsuEntity> page = this.selectPage(
                new Query<DiscusstesefengsuEntity>(params).getPage(),
                new EntityWrapper<DiscusstesefengsuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstesefengsuEntity> wrapper) {
		  Page<DiscusstesefengsuView> page =new Query<DiscusstesefengsuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstesefengsuVO> selectListVO(Wrapper<DiscusstesefengsuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstesefengsuVO selectVO(Wrapper<DiscusstesefengsuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstesefengsuView> selectListView(Wrapper<DiscusstesefengsuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstesefengsuView selectView(Wrapper<DiscusstesefengsuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
