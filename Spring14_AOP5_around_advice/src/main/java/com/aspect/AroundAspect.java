package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//target인 UserService의 sayEcho()메서드 호출 시 위빙되는 aspect 객체
//https://docs.spring.io/spring-framework/docs/5.2.25.RELEASE/spring-framework-reference/core.html#aop-aj-ltw-first-example
@Aspect
public class AroundAspect {

	@Pointcut("execution(public String *Echo())")
	public void xxx() {}
	
	//sayEcho() 호출해서 호출전, 호출후, 정상적으로 리턴, 예외 발생 시 위빙됨
	//throwning 속성은 sayEcho()메서드에서 예외 발생 시 예외가 저장될 변수를 지정. catch(XXExcetion e)
	@Around(value = "xxx()") 
	public Object method2(ProceedingJoinPoint pjp)throws Throwable {//xxx에는 sayEcho()메서드가 리턴하는 값이 저장
		System.out.println("Around.method2>>");
		System.out.println("before advice 역할");
		Object xxx =pjp.proceed(); //sayEcho() 호출하고 리턴값은 xxx에 저장
		System.out.println("afterReturning advice 역할"+xxx);
		
		return xxx; //sayEcho()호출한 곳으로 리턴, main에서 받음
	}

//	//advice + pointcut같이 표현
//	@AfterReturning(pointcut="execution(* callEcho(..))", returning="yyy") //sayEcho 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:"+point.getSignature().getName());
//		System.out.println("AfterAspect.method3");
//	}
}
