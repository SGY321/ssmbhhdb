package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussershoujiaoyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussershoujiaoyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussershoujiaoyiView;


/**
 * 二手交易评论表
 *
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscussershoujiaoyiService extends IService<DiscussershoujiaoyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussershoujiaoyiVO> selectListVO(Wrapper<DiscussershoujiaoyiEntity> wrapper);
   	
   	DiscussershoujiaoyiVO selectVO(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
   	
   	List<DiscussershoujiaoyiView> selectListView(Wrapper<DiscussershoujiaoyiEntity> wrapper);
   	
   	DiscussershoujiaoyiView selectView(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussershoujiaoyiEntity> wrapper);
   	
}

