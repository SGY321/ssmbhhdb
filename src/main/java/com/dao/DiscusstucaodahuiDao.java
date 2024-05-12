package com.dao;

import com.entity.DiscusstucaodahuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstucaodahuiVO;
import com.entity.view.DiscusstucaodahuiView;


/**
 * 吐槽大会评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:13
 */
public interface DiscusstucaodahuiDao extends BaseMapper<DiscusstucaodahuiEntity> {
	
	List<DiscusstucaodahuiVO> selectListVO(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
	
	DiscusstucaodahuiVO selectVO(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
	
	List<DiscusstucaodahuiView> selectListView(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);

	List<DiscusstucaodahuiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
	
	DiscusstucaodahuiView selectView(@Param("ew") Wrapper<DiscusstucaodahuiEntity> wrapper);
	
}
