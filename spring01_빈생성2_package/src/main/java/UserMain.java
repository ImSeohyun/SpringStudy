import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.UserService;

public class UserMain {

	public static void main(String[] args) {
		
		//1. 이전 방식
//		UserService service = new UserService();
//		System.out.println(service.mesg());
		
		//2. 스프링 방식
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("com/config/user.xml");
		
		
		/*
		 - 작업 순서
    1) 빈을 생성( *.java)
	2) 빈을 xml에 등록 ==> src/main/resource에 저장. user.xml
	3) ApplicatonContext(빈) 에 xml을 알려준다.
	4) ApplicatonContext 가 xml에 등록된 빈 정보를 보고 자동생성 ~ 소멸 처리함.
		 
		 */
		
		
		
		
	}
}





