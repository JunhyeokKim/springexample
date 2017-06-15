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
		System.out.println("오늘 점심은 "+storeName+"에 가서 \n"+food.getType()+"을 "+food.getPrice()+"원으로 먹기로 했다.");
	}
	

}
