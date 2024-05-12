package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TucaodahuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TucaodahuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TucaodahuiView;


/**
 * 吐槽大会
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface TucaodahuiService extends IService<TucaodahuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TucaodahuiVO> selectListVO(Wrapper<TucaodahuiEntity> wrapper);
   	
   	TucaodahuiVO selectVO(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
   	
   	List<TucaodahuiView> selectListView(Wrapper<TucaodahuiEntity> wrapper);
   	
   	TucaodahuiView selectView(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TucaodahuiEntity> wrapper);
   	
}

