package com.dao;

import com.entity.JiaoyileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyileixingVO;
import com.entity.view.JiaoyileixingView;


/**
 * 交易类型
 * 
 * @author 
 * @email 
 * @date 2021-04-15 19:03:12
 */
public interface JiaoyileixingDao extends BaseMapper<JiaoyileixingEntity> {
	
	List<JiaoyileixingVO> selectListVO(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
	
	JiaoyileixingVO selectVO(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
	
	List<JiaoyileixingView> selectListView(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);

	List<JiaoyileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
	
	JiaoyileixingView selectView(@Param("ew") Wrapper<JiaoyileixingEntity> wrapper);
	
}
