package springweb.g01_aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class A01_Profiler {

	// 수행할 내용 처리 adivce 클래스 메서드
	// 특정 프로그램이 처리할 때, log 내용
	public Object trace(ProceedingJoinPoint jointPoint) throws Throwable{
		String signatureString= jointPoint.getSignature().toShortString();
		System.out.println(signatureString+"시작!!");
		long start= System.currentTimeMillis();
		try{
		
		Object result=jointPoint.proceed();
		return result;
		}finally {
			long finish= System.currentTimeMillis();
			System.out.println(signatureString+"종료!!");
			System.out.println(signatureString+"경과 시간:"+(finish-start)+"ms");
		}
	}
}
