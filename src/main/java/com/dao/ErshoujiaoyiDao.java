package com.dao;

import com.entity.ErshoujiaoyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshoujiaoyiVO;
import com.entity.view.ErshoujiaoyiView;


/**
 * 二手交易
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface ErshoujiaoyiDao extends BaseMapper<ErshoujiaoyiEntity> {
	
	List<ErshoujiaoyiVO> selectListVO(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
	
	ErshoujiaoyiVO selectVO(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
	
	List<ErshoujiaoyiView> selectListView(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);

	List<ErshoujiaoyiView> selectListView(Pagination page,@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
	
	ErshoujiaoyiView selectView(@Param("ew") Wrapper<ErshoujiaoyiEntity> wrapper);
	
}
