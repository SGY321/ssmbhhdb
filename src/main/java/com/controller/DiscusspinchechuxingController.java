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

import com.entity.DiscusspinchechuxingEntity;
import com.entity.view.DiscusspinchechuxingView;

import com.service.DiscusspinchechuxingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 拼车出行评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
@RestController
@RequestMapping("/discusspinchechuxing")
public class DiscusspinchechuxingController {
    @Autowired
    private DiscusspinchechuxingService discusspinchechuxingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusspinchechuxingEntity discusspinchechuxing, 
		HttpServletRequest request){

        EntityWrapper<DiscusspinchechuxingEntity> ew = new EntityWrapper<DiscusspinchechuxingEntity>();
		PageUtils page = discusspinchechuxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusspinchechuxing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusspinchechuxingEntity discusspinchechuxing, HttpServletRequest request){
        EntityWrapper<DiscusspinchechuxingEntity> ew = new EntityWrapper<DiscusspinchechuxingEntity>();
		PageUtils page = discusspinchechuxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusspinchechuxing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusspinchechuxingEntity discusspinchechuxing){
       	EntityWrapper<DiscusspinchechuxingEntity> ew = new EntityWrapper<DiscusspinchechuxingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusspinchechuxing, "discusspinchechuxing")); 
        return R.ok().put("data", discusspinchechuxingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusspinchechuxingEntity discusspinchechuxing){
        EntityWrapper< DiscusspinchechuxingEntity> ew = new EntityWrapper< DiscusspinchechuxingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusspinchechuxing, "discusspinchechuxing")); 
		DiscusspinchechuxingView discusspinchechuxingView =  discusspinchechuxingService.selectView(ew);
		return R.ok("查询拼车出行评论表成功").put("data", discusspinchechuxingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusspinchechuxingEntity discusspinchechuxing = discusspinchechuxingService.selectById(id);
        return R.ok().put("data", discusspinchechuxing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusspinchechuxingEntity discusspinchechuxing = discusspinchechuxingService.selectById(id);
        return R.ok().put("data", discusspinchechuxing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusspinchechuxingEntity discusspinchechuxing, HttpServletRequest request){
    	discusspinchechuxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusspinchechuxing);

        discusspinchechuxingService.insert(discusspinchechuxing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusspinchechuxingEntity discusspinchechuxing, HttpServletRequest request){
    	discusspinchechuxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusspinchechuxing);

        discusspinchechuxingService.insert(discusspinchechuxing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusspinchechuxingEntity discusspinchechuxing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusspinchechuxing);
        discusspinchechuxingService.updateById(discusspinchechuxing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusspinchechuxingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DiscusspinchechuxingEntity> wrapper = new EntityWrapper<DiscusspinchechuxingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discusspinchechuxingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
