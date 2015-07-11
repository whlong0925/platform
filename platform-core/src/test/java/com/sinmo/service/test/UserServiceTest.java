package com.sinmo.service.test;
import java.util.List;

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
		for(int i=0;i<5;i++){
			User t = new User();
			t.setUsercode("usercode"+i);
			t.setUsername("username"+i);
			t.setDeptId(i);
			this.userService.saveUser(t);
			Department d = new Department();
			d.setDepartName("departname"+i);
			this.deptService.saveDept(d);
		}
	}
	@Test
	public void testLoad() {//测试只读事务不能增删改
		User t = new User();
		t.setUsercode("admin");
		t.setUsername("adminname");
		t.setId(2);
		this.userService.loadUser(t);
	}
	@Test
	public void testDelete() {
		this.userService.deleteUserById(6);
	}
	@Test
	public void testGet() {
		String sql = "select u.*,d.departName from t_user u left join t_department d on u.deptId = d.id where u.id = ?";
		List<User> list = this.userService.getListUserBySql(sql, new Object[]{2});
		for(User user : list){
			System.out.println("deptname:"+user.getDepartName()+",deptId="+user.getDeptId()+",username="+user.getUsername());
		}
		System.out.println(list.size());
	}
 
}