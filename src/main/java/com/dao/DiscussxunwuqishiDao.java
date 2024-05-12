package com.dao;

import com.entity.DiscussxunwuqishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxunwuqishiVO;
import com.entity.view.DiscussxunwuqishiView;


/**
 * 寻物启事评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface DiscussxunwuqishiDao extends BaseMapper<DiscussxunwuqishiEntity> {
	
	List<DiscussxunwuqishiVO> selectListVO(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
	
	DiscussxunwuqishiVO selectVO(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
	
	List<DiscussxunwuqishiView> selectListView(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);

	List<DiscussxunwuqishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
	
	DiscussxunwuqishiView selectView(@Param("ew") Wrapper<DiscussxunwuqishiEntity> wrapper);
	
}
