package com.dao;

import com.entity.PinchechuxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinchechuxingVO;
import com.entity.view.PinchechuxingView;


/**
 * 拼车出行
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface PinchechuxingDao extends BaseMapper<PinchechuxingEntity> {
	
	List<PinchechuxingVO> selectListVO(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
	
	PinchechuxingVO selectVO(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
	
	List<PinchechuxingView> selectListView(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);

	List<PinchechuxingView> selectListView(Pagination page,@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
	
	PinchechuxingView selectView(@Param("ew") Wrapper<PinchechuxingEntity> wrapper);
	
}
