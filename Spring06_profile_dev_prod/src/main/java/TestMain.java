import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class TestMain {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		//profile 결정
		ctx.getEnvironment().setActiveProfiles("prod"); // dev으로도 설정 가능
		// xml 등록
		ctx.load("classpath:com/config/user_dev.xml","classpath:com/config/user_prod.xml");
		ctx.refresh();
		
		//빈 얻기 ( 다형성 )
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service.mesg());
	}

}
