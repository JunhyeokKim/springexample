package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robot {
	@Autowired(required=false)
	@Qualifier("w2")
	private Weapon wp;
	private String kind;
	
	public Robot(String kind){
		this.kind=kind;
	}

	public void attacking() {
		System.out.println(kind+" �κ��� "+wp.attack()+" ������ �մϴ�.");
	}


	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	

}

