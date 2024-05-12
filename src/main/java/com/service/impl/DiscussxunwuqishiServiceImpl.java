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


import com.dao.DiscussxunwuqishiDao;
import com.entity.DiscussxunwuqishiEntity;
import com.service.DiscussxunwuqishiService;
import com.entity.vo.DiscussxunwuqishiVO;
import com.entity.view.DiscussxunwuqishiView;

@Service("discussxunwuqishiService")
public class DiscussxunwuqishiServiceImpl extends ServiceImpl<DiscussxunwuqishiDao, DiscussxunwuqishiEntity> implements DiscussxunwuqishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxunwuqishiEntity> page = this.selectPage(
                new Query<DiscussxunwuqishiEntity>(params).getPage(),
                new EntityWrapper<DiscussxunwuqishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxunwuqishiEntity> wrapper) {
		  Page<DiscussxunwuqishiView> page =new Query<DiscussxunwuqishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxunwuqishiVO> selectListVO(Wrapper<DiscussxunwuqishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxunwuqishiVO selectVO(Wrapper<DiscussxunwuqishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxunwuqishiView> selectListView(Wrapper<DiscussxunwuqishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxunwuqishiView selectView(Wrapper<DiscussxunwuqishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
