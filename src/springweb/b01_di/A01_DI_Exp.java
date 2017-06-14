package springweb.b01_di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springweb.z01_dto.Person;

public class A01_DI_Exp {
	public static void main(String[] args) {
		// xml 로딩
		Resource rs= new ClassPathResource("springweb/b01_di/diexp.xml");
		// BeanFactory : bean 객체 호출
		// xmlBeanFactory : xml에 있는 bean 호출
		BeanFactory bean= new XmlBeanFactory(rs);
		// 해당 bean id값으로 로딩.. xml id="p"
		Person p= (Person)bean.getBean("p");
		System.out.println("이름:" + p.getName());
		System.out.println("나이:" + p.getAge());

	}
}
