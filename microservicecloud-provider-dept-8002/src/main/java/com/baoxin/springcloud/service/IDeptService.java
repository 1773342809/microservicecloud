package com.baoxin.springcloud.service;

import java.util.List;

import com.baoxin.springcloud.entities.Dept;

public interface IDeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
