package test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zzj.entity.ConnectonidMatchUserid;
import com.zzj.service.ConnectonidMatchUseridService;

public class Test2 {
	@Test
	public void test1() {
		System.out.println();
		String path = "D://deng//workspacel//expert//src//spring.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(path);

	/*	UserService userService = (UserService) context.getBean("userService");*/

	}
}
