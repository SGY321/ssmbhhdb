package com.dao;

import com.entity.DiscussershoujiaoyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussershoujiaoyiVO;
import com.entity.view.DiscussershoujiaoyiView;


/**
 * 二手交易评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscussershoujiaoyiDao extends BaseMapper<DiscussershoujiaoyiEntity> {
	
	List<DiscussershoujiaoyiVO> selectListVO(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
	
	DiscussershoujiaoyiVO selectVO(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
	
	List<DiscussershoujiaoyiView> selectListView(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);

	List<DiscussershoujiaoyiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
	
	DiscussershoujiaoyiView selectView(@Param("ew") Wrapper<DiscussershoujiaoyiEntity> wrapper);
	
}
