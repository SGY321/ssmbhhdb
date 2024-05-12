package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusspinchechuxingDao;
import com.entity.DiscusspinchechuxingEntity;
import com.service.DiscusspinchechuxingService;
import com.entity.vo.DiscusspinchechuxingVO;
import com.entity.view.DiscusspinchechuxingView;

@Service("discusspinchechuxingService")
public class DiscusspinchechuxingServiceImpl extends ServiceImpl<DiscusspinchechuxingDao, DiscusspinchechuxingEntity> implements DiscusspinchechuxingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusspinchechuxingEntity> page = this.selectPage(
                new Query<DiscusspinchechuxingEntity>(params).getPage(),
                new EntityWrapper<DiscusspinchechuxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusspinchechuxingEntity> wrapper) {
		  Page<DiscusspinchechuxingView> page =new Query<DiscusspinchechuxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusspinchechuxingVO> selectListVO(Wrapper<DiscusspinchechuxingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusspinchechuxingVO selectVO(Wrapper<DiscusspinchechuxingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusspinchechuxingView> selectListView(Wrapper<DiscusspinchechuxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusspinchechuxingView selectView(Wrapper<DiscusspinchechuxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
