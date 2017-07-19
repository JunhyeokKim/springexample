package springweb.g01_aop;

import org.aspectj.lang.ProceedingJoinPoint;
// springweb.g01_aop.A01_Profiler
public class A01_Profiler {

	// �닔�뻾�븷 �궡�슜 泥섎━ advice �겢�옒�뒪 硫붿꽌�뱶 
	// �듅�젙 �봽濡쒓렇�옩�씠 泥섎━�븷 �븣, log �궡�슜
	public Object trace(ProceedingJoinPoint jointPoint) 
				throws Throwable{
		// �빐�떦 紐⑤뱢�씠 �떆�옉�븯�뒗 �떆�옉怨�..
		// �빐�떦 紐⑤뱢�쓽 �젙蹂� 異쒕젰
		String signatureString=jointPoint.getSignature().toShortString();
		System.out.println(signatureString+"�떆�옉!!");
		// �쁽�옱 �떆�뒪�뀥 �닔�뻾 �떆媛꾩쓣 �굹���궡�뒗 湲곕뒫硫붿꽌�뱶( @@@ ###)
		long start = System.currentTimeMillis();
		try{			
			Object result=jointPoint.proceed();
			return result;
		}finally{
		
			// �걹�굹�뒗 �떆�옉�쓣 泥섎━�븯�뿬 �닔�뻾�떆媛꾩쓣 �솗�씤�븯�뒗 advice留뚮뱾
			long finish = System.currentTimeMillis();
			System.out.println(signatureString+"醫낅즺!!");
			System.out.println(signatureString+"�쓽 �닔�뻾 �떆媛�"+(finish-start)+"ms");
		}
	}


}
