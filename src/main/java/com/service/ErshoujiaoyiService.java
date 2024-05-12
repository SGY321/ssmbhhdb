package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshoujiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshoujiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshoujiaoyiView;


/**
 * 二手交易
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface ErshoujiaoyiService extends IService<ErshoujiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshoujiaoyiVO> selectListVO(Wrapper<ErshoujiaoyiEntity> wrapper);
   	
   	ErshoujiaoyiVO selectVO(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
   	
   	List<ErshoujiaoyiView> selectListView(Wrapper<ErshoujiaoyiEntity> wrapper);
   	
   	ErshoujiaoyiView selectView(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshoujiaoyiEntity> wrapper);
   	
}

