import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service);
		
	}

}
