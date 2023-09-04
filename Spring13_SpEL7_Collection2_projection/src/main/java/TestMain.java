import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Cat;
import com.dto.Person;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/config/user.xml");
		
		System.out.println("1. 전체 cat 목록");
		Person p1 =ctx.getBean("p1", Person.class); 
		List<Cat> catList = p1.getCatList();
		for(Cat cat: catList) {
			System.out.println(cat);
		}
		System.out.println("2. 이름만 출력");
		Person p2 =ctx.getBean("p2", Person.class); 
		List<String> usernameList = p2.getUsernameList();
		for(String name: usernameList) {
			System.out.println(name);
		}
		System.out.println("3. age lt 10인 이름만 모두 출력");
		Person p3 =ctx.getBean("p3", Person.class); 
		List<String> usernameList3 = p3.getUsernameList();
		for(String name: usernameList3) {
			System.out.println(name);
		}

	}
}
