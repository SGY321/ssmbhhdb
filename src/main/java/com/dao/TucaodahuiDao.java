package com.dao;

import com.entity.TucaodahuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TucaodahuiVO;
import com.entity.view.TucaodahuiView;


/**
 * 吐槽大会
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface TucaodahuiDao extends BaseMapper<TucaodahuiEntity> {
	
	List<TucaodahuiVO> selectListVO(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
	
	TucaodahuiVO selectVO(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
	
	List<TucaodahuiView> selectListView(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);

	List<TucaodahuiView> selectListView(Pagination page,@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
	
	TucaodahuiView selectView(@Param("ew") Wrapper<TucaodahuiEntity> wrapper);
	
}
