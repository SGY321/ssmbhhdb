package com.dao;

import com.entity.BiaobaiguangchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiaobaiguangchangVO;
import com.entity.view.BiaobaiguangchangView;


/**
 * 表白广场
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface BiaobaiguangchangDao extends BaseMapper<BiaobaiguangchangEntity> {
	
	List<BiaobaiguangchangVO> selectListVO(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
	
	BiaobaiguangchangVO selectVO(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
	
	List<BiaobaiguangchangView> selectListView(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);

	List<BiaobaiguangchangView> selectListView(Pagination page,@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
	
	BiaobaiguangchangView selectView(@Param("ew") Wrapper<BiaobaiguangchangEntity> wrapper);
	
}
