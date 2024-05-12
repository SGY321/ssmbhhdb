package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinchechuxingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinchechuxingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinchechuxingView;


/**
 * 拼车出行
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface PinchechuxingService extends IService<PinchechuxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinchechuxingVO> selectListVO(Wrapper<PinchechuxingEntity> wrapper);
   	
   	PinchechuxingVO selectVO(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
   	
   	List<PinchechuxingView> selectListView(Wrapper<PinchechuxingEntity> wrapper);
   	
   	PinchechuxingView selectView(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinchechuxingEntity> wrapper);
   	
}

