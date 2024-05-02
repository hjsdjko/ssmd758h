package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TesefengsuEntity;
import com.entity.view.TesefengsuView;

import com.service.TesefengsuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 特色风俗
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-27 17:01:31
 */
@RestController
@RequestMapping("/tesefengsu")
public class TesefengsuController {
    @Autowired
    private TesefengsuService tesefengsuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TesefengsuEntity tesefengsu, 
		HttpServletRequest request){

        EntityWrapper<TesefengsuEntity> ew = new EntityWrapper<TesefengsuEntity>();
		PageUtils page = tesefengsuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tesefengsu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TesefengsuEntity tesefengsu, HttpServletRequest request){
        EntityWrapper<TesefengsuEntity> ew = new EntityWrapper<TesefengsuEntity>();
		PageUtils page = tesefengsuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tesefengsu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TesefengsuEntity tesefengsu){
       	EntityWrapper<TesefengsuEntity> ew = new EntityWrapper<TesefengsuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tesefengsu, "tesefengsu")); 
        return R.ok().put("data", tesefengsuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TesefengsuEntity tesefengsu){
        EntityWrapper< TesefengsuEntity> ew = new EntityWrapper< TesefengsuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tesefengsu, "tesefengsu")); 
		TesefengsuView tesefengsuView =  tesefengsuService.selectView(ew);
		return R.ok("查询特色风俗成功").put("data", tesefengsuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TesefengsuEntity tesefengsu = tesefengsuService.selectById(id);
		tesefengsu.setClicknum(tesefengsu.getClicknum()+1);
		tesefengsuService.updateById(tesefengsu);
        return R.ok().put("data", tesefengsu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TesefengsuEntity tesefengsu = tesefengsuService.selectById(id);
		tesefengsu.setClicknum(tesefengsu.getClicknum()+1);
		tesefengsuService.updateById(tesefengsu);
        return R.ok().put("data", tesefengsu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        TesefengsuEntity tesefengsu = tesefengsuService.selectById(id);
        if(type.equals("1")) {
        	tesefengsu.setThumbsupnum(tesefengsu.getThumbsupnum()+1);
        } else {
        	tesefengsu.setCrazilynum(tesefengsu.getCrazilynum()+1);
        }
        tesefengsuService.updateById(tesefengsu);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TesefengsuEntity tesefengsu, HttpServletRequest request){
    	tesefengsu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tesefengsu);

        tesefengsuService.insert(tesefengsu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TesefengsuEntity tesefengsu, HttpServletRequest request){
    	tesefengsu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tesefengsu);

        tesefengsuService.insert(tesefengsu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TesefengsuEntity tesefengsu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tesefengsu);
        tesefengsuService.updateById(tesefengsu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tesefengsuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TesefengsuEntity> wrapper = new EntityWrapper<TesefengsuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = tesefengsuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
