package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxunwuqishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxunwuqishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxunwuqishiView;


/**
 * 寻物启事评论表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface DiscussxunwuqishiService extends IService<DiscussxunwuqishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxunwuqishiVO> selectListVO(Wrapper<DiscussxunwuqishiEntity> wrapper);
   	
   	DiscussxunwuqishiVO selectVO(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
   	
   	List<DiscussxunwuqishiView> selectListView(Wrapper<DiscussxunwuqishiEntity> wrapper);
   	
   	DiscussxunwuqishiView selectView(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxunwuqishiEntity> wrapper);
   	
}

