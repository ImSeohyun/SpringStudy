
//자바의 싱글톤 패턴 구현 (singleton design pattern)
//UserService를 한 번만 생성하게끔 구현
class UserService{
	
	//3. static 변수로 지정
	private static UserService service;
	
	//1. 생성자를 private로 지정 -> 자기자신에게선 생성 가능
	private UserService() {
	}
	
	//2. 자기자신의 메서드에서 생성
	public static UserService getInstance() {
		//맨 처음 호출 시 null이라 if문 실행되어 객체생성 되고 service변수에 100번지저장
		//두번째 호출부터는 null이 아니므로 100번지를 가져온다
		if(service == null) {
			service = new UserService();
		}
		return service;
	}//메서드를 호출하려 해도 객체 생성 없이는 못 함 -> static
	
	//객체의 단 한번의 생성을 위해 private 생성자를 두고 static변수를 두어 
	//메서드 처음 호출시 new를 하고 다음 호출시에는 이미 변수에 저장해둔 객체를 가져온다
}
public class TestMain {

	public static void main(String[] args) {
		//대표적인 싱글톤 객체: Calendar.getInstance()
		UserService s1 = UserService.getInstance();//100번지
		UserService s2 = UserService.getInstance();//100번지
		UserService s3 = UserService.getInstance();//100번지
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
