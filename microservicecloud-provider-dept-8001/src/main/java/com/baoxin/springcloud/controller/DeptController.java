package com.baoxin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baoxin.springcloud.entities.Dept;
import com.baoxin.springcloud.service.IDeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private IDeptService deptService;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
	
	//测试@EnableDiscoveryClient,消费端可以调用服务发现
	@RequestMapping(value = "/discovery", method = RequestMethod.GET)
	public List<ServiceInstance> discovery() {
		List<String> services = discoveryClient.getServices();
		List<ServiceInstance> instances = discoveryClient.getInstances(services.get(0));
		for(ServiceInstance instance : instances) {
			System.out.println(instance.getServiceId());
			System.out.println(instance.getHost());
			System.out.println(instance.getPort());
			System.out.println(instance.getUri());
			System.out.println(instance.getMetadata());
		}
		return instances;
	}
}
