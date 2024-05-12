package com.dao;

import com.entity.DiscusspinchechuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusspinchechuxingVO;
import com.entity.view.DiscusspinchechuxingView;


/**
 * 拼车出行评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscusspinchechuxingDao extends BaseMapper<DiscusspinchechuxingEntity> {
	
	List<DiscusspinchechuxingVO> selectListVO(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
	
	DiscusspinchechuxingVO selectVO(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
	
	List<DiscusspinchechuxingView> selectListView(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);

	List<DiscusspinchechuxingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
	
	DiscusspinchechuxingView selectView(@Param("ew") Wrapper<DiscusspinchechuxingEntity> wrapper);
	
}
