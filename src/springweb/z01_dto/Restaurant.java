package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	private String storeName;
	@Autowired
	private Food food;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public void eatLunch(){
		if(food!=null)
		System.out.println("���� ������ "+storeName+"�� ���� \n"+food.getType()+"�� "+food.getPrice()+"������ �Ա�� �ߴ�.");
	}
	

}
