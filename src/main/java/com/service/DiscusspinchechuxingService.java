package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusspinchechuxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusspinchechuxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusspinchechuxingView;


/**
 * 拼车出行评论表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscusspinchechuxingService extends IService<DiscusspinchechuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusspinchechuxingVO> selectListVO(Wrapper<DiscusspinchechuxingEntity> wrapper);
   	
   	DiscusspinchechuxingVO selectVO(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
   	
   	List<DiscusspinchechuxingView> selectListView(Wrapper<DiscusspinchechuxingEntity> wrapper);
   	
   	DiscusspinchechuxingView selectView(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusspinchechuxingEntity> wrapper);
   	
}

