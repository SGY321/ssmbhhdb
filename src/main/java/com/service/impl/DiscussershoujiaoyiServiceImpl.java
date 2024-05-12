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


import com.dao.DiscussershoujiaoyiDao;
import com.entity.DiscussershoujiaoyiEntity;
import com.service.DiscussershoujiaoyiService;
import com.entity.vo.DiscussershoujiaoyiVO;
import com.entity.view.DiscussershoujiaoyiView;

@Service("discussershoujiaoyiService")
public class DiscussershoujiaoyiServiceImpl extends ServiceImpl<DiscussershoujiaoyiDao, DiscussershoujiaoyiEntity> implements DiscussershoujiaoyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussershoujiaoyiEntity> page = this.selectPage(
                new Query<DiscussershoujiaoyiEntity>(params).getPage(),
                new EntityWrapper<DiscussershoujiaoyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussershoujiaoyiEntity> wrapper) {
		  Page<DiscussershoujiaoyiView> page =new Query<DiscussershoujiaoyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussershoujiaoyiVO> selectListVO(Wrapper<DiscussershoujiaoyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussershoujiaoyiVO selectVO(Wrapper<DiscussershoujiaoyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussershoujiaoyiView> selectListView(Wrapper<DiscussershoujiaoyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussershoujiaoyiView selectView(Wrapper<DiscussershoujiaoyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
