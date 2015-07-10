import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.sinmo.basic.model.User;
import com.sinmo.common.DateUtil;
import com.sinmo.service.IUserService;
 
 
@ContextConfiguration(locations = {"classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class UserServiceTest {
	@Resource
	private IUserService userService;
 
	@Test
	public void test() {
		User t = new User();
		t.setUsercode("admin");
		t.setUsername("adminname");
		userService.add(t);
		System.out.println(DateUtil.getDate());
	}
 
}