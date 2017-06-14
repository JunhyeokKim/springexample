package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.Restaurant;

public class A19_GenericXml {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("springweb/b01_di/diexp19_auto.xml");
		Restaurant restaurant = ctx.getBean("restaurant", Restaurant.class);
		System.out.println(restaurant.getStoreName());
		restaurant.eatLunch();
	}

}
