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


import com.dao.PinchechuxingDao;
import com.entity.PinchechuxingEntity;
import com.service.PinchechuxingService;
import com.entity.vo.PinchechuxingVO;
import com.entity.view.PinchechuxingView;

@Service("pinchechuxingService")
public class PinchechuxingServiceImpl extends ServiceImpl<PinchechuxingDao, PinchechuxingEntity> implements PinchechuxingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinchechuxingEntity> page = this.selectPage(
                new Query<PinchechuxingEntity>(params).getPage(),
                new EntityWrapper<PinchechuxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinchechuxingEntity> wrapper) {
		  Page<PinchechuxingView> page =new Query<PinchechuxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinchechuxingVO> selectListVO(Wrapper<PinchechuxingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinchechuxingVO selectVO(Wrapper<PinchechuxingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinchechuxingView> selectListView(Wrapper<PinchechuxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinchechuxingView selectView(Wrapper<PinchechuxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
