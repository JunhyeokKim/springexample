package springweb.g01_aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class A01_Profiler {

	// ������ ���� ó�� adivce Ŭ���� �޼���
	// Ư�� ���α׷��� ó���� ��, log ����
	public Object trace(ProceedingJoinPoint jointPoint) throws Throwable{
		String signatureString= jointPoint.getSignature().toShortString();
		System.out.println(signatureString+"����!!");
		long start= System.currentTimeMillis();
		try{
		
		Object result=jointPoint.proceed();
		return result;
		}finally {
			long finish= System.currentTimeMillis();
			System.out.println(signatureString+"����!!");
			System.out.println(signatureString+"��� �ð�:"+(finish-start)+"ms");
		}
	}
}
