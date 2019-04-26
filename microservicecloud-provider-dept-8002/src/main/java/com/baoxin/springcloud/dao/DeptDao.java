package com.baoxin.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.baoxin.springcloud.entities.Dept;

@Mapper
@Repository
public interface DeptDao {

	@Transactional(rollbackFor=Exception.class)
	public boolean addDept(Dept dept);

	@Transactional(readOnly=true)
	public Dept findById(Long id);

	@Transactional(readOnly=true)
	public List<Dept> findAll();
}
