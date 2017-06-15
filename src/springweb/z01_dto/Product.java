package springweb.z01_dto;

public class Product {
	private String name;
	private int price;
	private int cnt;
	private int tot;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public int getCnt() {
		return cnt;
	}

	public int getTot() {
		return tot;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
