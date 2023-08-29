import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("service",UserService.class);
		
		List<Cat> list = service.getCatList();
		System.out.println(list);
		
	}

}
