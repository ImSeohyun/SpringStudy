import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService2;

public class UserMain2 {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				("classpath:com/config/user2.xml");
		
		UserService2 service = ctx.getBean("service",UserService2.class);
		
		Set<Cat> set = service.getCatSet();
		System.out.println(set);
		
	}

}
