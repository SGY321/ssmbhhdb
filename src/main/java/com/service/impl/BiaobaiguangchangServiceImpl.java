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


import com.dao.BiaobaiguangchangDao;
import com.entity.BiaobaiguangchangEntity;
import com.service.BiaobaiguangchangService;
import com.entity.vo.BiaobaiguangchangVO;
import com.entity.view.BiaobaiguangchangView;

@Service("biaobaiguangchangService")
public class BiaobaiguangchangServiceImpl extends ServiceImpl<BiaobaiguangchangDao, BiaobaiguangchangEntity> implements BiaobaiguangchangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiaobaiguangchangEntity> page = this.selectPage(
                new Query<BiaobaiguangchangEntity>(params).getPage(),
                new EntityWrapper<BiaobaiguangchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiaobaiguangchangEntity> wrapper) {
		  Page<BiaobaiguangchangView> page =new Query<BiaobaiguangchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiaobaiguangchangVO> selectListVO(Wrapper<BiaobaiguangchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiaobaiguangchangVO selectVO(Wrapper<BiaobaiguangchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiaobaiguangchangView> selectListView(Wrapper<BiaobaiguangchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiaobaiguangchangView selectView(Wrapper<BiaobaiguangchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
