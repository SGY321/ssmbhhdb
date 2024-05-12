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


import com.dao.DiscussbiaobaiguangchangDao;
import com.entity.DiscussbiaobaiguangchangEntity;
import com.service.DiscussbiaobaiguangchangService;
import com.entity.vo.DiscussbiaobaiguangchangVO;
import com.entity.view.DiscussbiaobaiguangchangView;

@Service("discussbiaobaiguangchangService")
public class DiscussbiaobaiguangchangServiceImpl extends ServiceImpl<DiscussbiaobaiguangchangDao, DiscussbiaobaiguangchangEntity> implements DiscussbiaobaiguangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbiaobaiguangchangEntity> page = this.selectPage(
                new Query<DiscussbiaobaiguangchangEntity>(params).getPage(),
                new EntityWrapper<DiscussbiaobaiguangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbiaobaiguangchangEntity> wrapper) {
		  Page<DiscussbiaobaiguangchangView> page =new Query<DiscussbiaobaiguangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbiaobaiguangchangVO> selectListVO(Wrapper<DiscussbiaobaiguangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbiaobaiguangchangVO selectVO(Wrapper<DiscussbiaobaiguangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbiaobaiguangchangView> selectListView(Wrapper<DiscussbiaobaiguangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbiaobaiguangchangView selectView(Wrapper<DiscussbiaobaiguangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
