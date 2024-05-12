package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbiaobaiguangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbiaobaiguangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbiaobaiguangchangView;


/**
 * 表白广场评论表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscussbiaobaiguangchangService extends IService<DiscussbiaobaiguangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbiaobaiguangchangVO> selectListVO(Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
   	
   	DiscussbiaobaiguangchangVO selectVO(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
   	
   	List<DiscussbiaobaiguangchangView> selectListView(Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
   	
   	DiscussbiaobaiguangchangView selectView(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
   	
}

