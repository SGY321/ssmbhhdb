package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiaobaiguangchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiaobaiguangchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiaobaiguangchangView;


/**
 * 表白广场
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface BiaobaiguangchangService extends IService<BiaobaiguangchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiaobaiguangchangVO> selectListVO(Wrapper<BiaobaiguangchangEntity> wrapper);
   	
   	BiaobaiguangchangVO selectVO(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
   	
   	List<BiaobaiguangchangView> selectListView(Wrapper<BiaobaiguangchangEntity> wrapper);
   	
   	BiaobaiguangchangView selectView(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiaobaiguangchangEntity> wrapper);
   	
}

