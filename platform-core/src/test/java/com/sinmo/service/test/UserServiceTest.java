package com.sinmo.service.test;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sinmo.model.Department;
import com.sinmo.model.User;
import com.sinmo.service.IDeptService;
import com.sinmo.service.IUserService;
 
 
@ContextConfiguration(locations = {"classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
	@Resource
	private IUserService userService;
	@Resource
	private IDeptService deptService;
 
	@Test
	public void testSave() {
		/*for(int i=0;i<5;i++){
			User t = new User();
			t.setUsercode("usercode"+i);
			t.setUsername("username"+i);
			t.setDeptId(i);
			this.userService.saveUser(t);
			Department d = new Department();
			d.setDepartName("departname"+i);
			this.deptService.saveDept(d);
		}*/
		Department d = new Department();
		d.setDepartName("departname");
		this.deptService.saveDept(d);
		/*User t = new User();
		t.setUsercode("admin");
		t.setUsername("adminname");
		System.out.println("test load");
		this.userService.saveUser(t);*/
	}
	@Test
	public void testLoad() {//测试只读事务
		User t = new User();
		t.setUsercode("admin");
		t.setUsername("adminname");
		t.setId(9);
		System.out.println("test load");
		this.userService.loadUser(t);
	}
	@Test
	public void testDelete() {
		this.userService.deleteUserById(6);
	}
 
}