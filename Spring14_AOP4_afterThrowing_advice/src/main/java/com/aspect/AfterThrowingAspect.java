package com.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//target인 UserService의 sayEcho()메서드 호출 시 위빙되는 aspect 객체

@Aspect
public class AfterThrowingAspect {

	@Pointcut("execution(public String *Echo())")
	public void xxx() {}
	
	//sayEcho() 호출해서 예외가 발생했을 때만 위빙됨
	//throwning 속성은 sayEcho()메서드에서 예외 발생 시 예외가 저장될 변수를 지정. catch(XXExcetion e)
	@AfterThrowing(pointcut="xxx()",throwing = "e") 
	public void method2(Exception e) {//xxx에는 sayEcho()메서드가 리턴하는 값이 저장
		System.out.println("AfterReturningAspect.method2>>"+ e.getMessage());
	}

//	//advice + pointcut같이 표현
//	@AfterReturning(pointcut="execution(* callEcho(..))", returning="yyy") //sayEcho 호출 후에 실행됨
//	public void method3(JoinPoint point, Object yyy) {
//		System.out.println("호출한 핵심기능 메서드명:"+point.getSignature().getName());
//		System.out.println("AfterAspect.method3");
//	}
}
