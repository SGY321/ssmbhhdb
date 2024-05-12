package com.dao;

import com.entity.DiscussbiaobaiguangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbiaobaiguangchangVO;
import com.entity.view.DiscussbiaobaiguangchangView;


/**
 * 表白广场评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscussbiaobaiguangchangDao extends BaseMapper<DiscussbiaobaiguangchangEntity> {
	
	List<DiscussbiaobaiguangchangVO> selectListVO(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
	
	DiscussbiaobaiguangchangVO selectVO(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
	
	List<DiscussbiaobaiguangchangView> selectListView(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);

	List<DiscussbiaobaiguangchangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
	
	DiscussbiaobaiguangchangView selectView(@Param("ew") Wrapper<DiscussbiaobaiguangchangEntity> wrapper);
	
}
