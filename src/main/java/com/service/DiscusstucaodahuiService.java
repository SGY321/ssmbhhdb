package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstucaodahuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstucaodahuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstucaodahuiView;


/**
 * 吐槽大会评论表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscusstucaodahuiService extends IService<DiscusstucaodahuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstucaodahuiVO> selectListVO(Wrapper<DiscusstucaodahuiEntity> wrapper);
   	
   	DiscusstucaodahuiVO selectVO(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
   	
   	List<DiscusstucaodahuiView> selectListView(Wrapper<DiscusstucaodahuiEntity> wrapper);
   	
   	DiscusstucaodahuiView selectView(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstucaodahuiEntity> wrapper);
   	
}

