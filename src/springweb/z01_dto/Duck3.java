package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Duck3 {
	private String type;
	// 해당 조립기 내에 LakeFlying와 동일한 type이 로딩되어 있으면
	// 자동으로 할당하세요
	@Autowired(required = false)	// 메모리에 로딩되지 않은 객체에 대해 오류 여부 결정 (default=true)
	@Qualifier("flyway01")
	private Flyway fly;

	/*
	 * Flyway f01= new LakeFlying();
	 * Flyway f02= new SeaFlying();
	*/
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void showFly() {
		if (fly != null) {
			System.out.println(type + "오리가 ");
			fly.fly();
		}
	}

}
