package com.baoxin.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baoxin.springcloud.dao.DeptDao;
import com.baoxin.springcloud.entities.Dept;
import com.baoxin.springcloud.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {
	
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
