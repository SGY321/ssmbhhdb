package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyileixingView;


/**
 * 交易类型
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface JiaoyileixingService extends IService<JiaoyileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyileixingVO> selectListVO(Wrapper<JiaoyileixingEntity> wrapper);
   	
   	JiaoyileixingVO selectVO(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
   	
   	List<JiaoyileixingView> selectListView(Wrapper<JiaoyileixingEntity> wrapper);
   	
   	JiaoyileixingView selectView(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyileixingEntity> wrapper);
   	
}

