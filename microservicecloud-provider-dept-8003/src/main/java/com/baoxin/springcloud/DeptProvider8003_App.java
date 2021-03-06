package com.baoxin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //测试@EnableDiscoveryClient,消费端可以调用服务发现
public class DeptProvider8003_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8003_App.class, args);
	}
}
