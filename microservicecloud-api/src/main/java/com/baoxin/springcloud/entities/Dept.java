package com.baoxin.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description: 员工实体
 * @author: baoxin 
 * @date: 2019年2月19日 下午2:50:11
 */
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
	private static final long serialVersionUID = 8809922840006105762L;
	private Long  deptno;   //主键
	private String  dname;   //部门名称
	private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
