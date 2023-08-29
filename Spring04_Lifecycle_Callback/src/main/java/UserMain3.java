import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.service.UserService;

public class UserMain3 {

	public static void main(String[] args) {

		// IoC Container 생성
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user3.xml");
		
		ctx.close(); 
	
		
	}

}
