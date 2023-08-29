import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService4;

public class UserMain4 {

	public static void main(String[] args) {

		// IoC Container 생성
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				("classpath:com/config/user4.xml");
		
		UserService4 service = ctx.getBean("service",UserService4.class);

		Properties phones = service.getPhones();
		
		Set<String> keys = phones.stringPropertyNames();//map의 keySet과 동일
		for(String key: keys) {
			System.out.println(key+"\t"+phones.get(key));
		}
		
	}

}
