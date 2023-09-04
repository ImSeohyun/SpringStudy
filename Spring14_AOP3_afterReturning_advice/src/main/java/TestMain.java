import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		UserService service = ctx.getBean("target",UserService.class);
		
		System.out.println(service.sayEcho());
		System.out.println();
		System.out.println(service.callEcho());

	}
}
