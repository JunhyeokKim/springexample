package springweb.z01_dto;

public class BookStore {
	private String storeName;
	private Book b;
	public BookStore(Book display){
		this.b=display;
	}
	public void displayBook(){
		System.out.println(storeName+"에서\n전시하는 도서는 "+b.getName()+", 가격은 "+b.getPrice());
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Book getB() {
		return b;
	}
	public void setB(Book b) {
		this.b = b;
	}
	

}
