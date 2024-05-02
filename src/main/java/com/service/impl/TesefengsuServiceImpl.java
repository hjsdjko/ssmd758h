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


import com.dao.TesefengsuDao;
import com.entity.TesefengsuEntity;
import com.service.TesefengsuService;
import com.entity.vo.TesefengsuVO;
import com.entity.view.TesefengsuView;

@Service("tesefengsuService")
public class TesefengsuServiceImpl extends ServiceImpl<TesefengsuDao, TesefengsuEntity> implements TesefengsuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TesefengsuEntity> page = this.selectPage(
                new Query<TesefengsuEntity>(params).getPage(),
                new EntityWrapper<TesefengsuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TesefengsuEntity> wrapper) {
		  Page<TesefengsuView> page =new Query<TesefengsuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TesefengsuVO> selectListVO(Wrapper<TesefengsuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TesefengsuVO selectVO(Wrapper<TesefengsuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TesefengsuView> selectListView(Wrapper<TesefengsuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TesefengsuView selectView(Wrapper<TesefengsuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
