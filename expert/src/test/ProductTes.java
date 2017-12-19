package test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@org.junit.runner.RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"/conf/spring/db.xml",
		"/conf/spring/application.xml"
		,"/conf/spring/dao_mgr.xml","/conf/spring/service_mgr.xml"})
//@ContextConfiguration(locations = { "/conf/spring/application.xml","/conf/spring/dao_mgr.xml","/conf/spring/db.xml","/conf/spring/service_mgr.xml","/conf/spring/service.xml" })
public class ProductTes /*extends AbstractJUnit4SpringContextTests*/  {

	
	

}
