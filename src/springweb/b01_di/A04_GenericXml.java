package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.DailySchedule;
import springweb.z01_dto.Mart;

public class A04_GenericXml {
public static void main(String[] args) {
	/*AbstractApplicationContext ctx= new GenericXmlApplicationContext("springweb/b01_di/diexp04.xml");
	Mart mart= ctx.getBean("mart",Mart.class);
	mart.selling();*/
	AbstractApplicationContext ctx= new GenericXmlApplicationContext("springweb/b01_di/diexp05.xml");
	DailySchedule ds= ctx.getBean("dailySchedule",DailySchedule.class);
	ds.showSchedule();
}
}
