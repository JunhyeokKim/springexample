package springweb.b01_di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springweb.z01_dto.Weather;

public class A02_DI_Exp {
	public static void main(String[] args) {
		Resource rs= new ClassPathResource("springweb/b01_di/diexp02.xml");
		BeanFactory bean= new XmlBeanFactory(rs);
		Weather weather01=(Weather)bean.getBean("weather01");
		System.out.println("날짜: "+weather01.getDate());
		System.out.println("지역: "+weather01.getLoc());
		System.out.println("정보: "+weather01.getInfo());
	}

}
