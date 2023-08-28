import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:com/config/user.xml");
		
		// 빈 얻기
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service.getNum());
		
		
	}

}
