package springweb.b01_di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springweb.z01_dto.Book;
import springweb.z01_dto.BookStore;

public class A11_GenericXml {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("springweb/b01_di/diexp11_auto.xml");
		Book b = ctx.getBean("book", Book.class);
		BookStore store = ctx.getBean("store", BookStore.class);
		store.displayBook();
	}

}
