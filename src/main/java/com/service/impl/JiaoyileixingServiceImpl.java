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


import com.dao.JiaoyileixingDao;
import com.entity.JiaoyileixingEntity;
import com.service.JiaoyileixingService;
import com.entity.vo.JiaoyileixingVO;
import com.entity.view.JiaoyileixingView;

@Service("jiaoyileixingService")
public class JiaoyileixingServiceImpl extends ServiceImpl<JiaoyileixingDao, JiaoyileixingEntity> implements JiaoyileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyileixingEntity> page = this.selectPage(
                new Query<JiaoyileixingEntity>(params).getPage(),
                new EntityWrapper<JiaoyileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyileixingEntity> wrapper) {
		  Page<JiaoyileixingView> page =new Query<JiaoyileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyileixingVO> selectListVO(Wrapper<JiaoyileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyileixingVO selectVO(Wrapper<JiaoyileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyileixingView> selectListView(Wrapper<JiaoyileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyileixingView selectView(Wrapper<JiaoyileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
