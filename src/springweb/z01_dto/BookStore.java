package springweb.z01_dto;

public class BookStore {
	private String storeName;
	private Book b;
	public BookStore(Book display){
		this.b=display;
	}
	public void displayBook(){
		System.out.println(storeName+"����\n�����ϴ� ������ "+b.getName()+", ������ "+b.getPrice());
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
