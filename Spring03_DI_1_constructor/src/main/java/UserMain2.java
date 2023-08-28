import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.service.UserService2;

public class UserMain2 {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
		new ClassPathXmlApplicationContext("classpath:com/config/user2.xml");
		
		// 빈 얻기
		UserService2 xxx =
				ctx.getBean("xxx", UserService2.class);
		System.out.println(xxx.getNum());
		
		UserService2 yyy = 
				ctx.getBean("yyy", UserService2.class);
		System.out.println(yyy.getNum()+"\t" + yyy.getUsername());
		
		
	}

}
