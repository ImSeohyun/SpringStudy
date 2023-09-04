package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//target인 UserService의 sayEcho()메서드 호출 시 위빙되는 aspect 객체

@Aspect
public class AfterReturningAspect {

	@Pointcut("execution(public String *Echo())")
	public void xxx() {}
	
	//sayEcho() 호출해서 정상적으로 리턴값을 리턴했을 때 위빙됨
	//returning 속성에 sayEcho()메서드가 리턴하는 값이 저장될 변수를 지정한다
	@AfterReturning(pointcut="xxx()",returning="xxx") 
	public void method2(Object xxx) {//xxx에는 sayEcho()메서드가 리턴하는 값이 저장
		System.out.println("AfterReturningAspect.method2>>"+ xxx);
	}

	//advice + pointcut같이 표현
	@AfterReturning(pointcut="execution(* callEcho(..))", returning="yyy") //sayEcho 호출 후에 실행됨
	public void method3(JoinPoint point, Object yyy) {
		System.out.println("호출한 핵심기능 메서드명:"+point.getSignature().getName());
		System.out.println("AfterAspect.method3");
	}
}
