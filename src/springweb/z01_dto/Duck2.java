package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Duck2 {
	private String type;
	// 해당 조립기 내에 LakeFlying와 동일한 type이 로딩되어 있으면
	// 자동으로 할당하세요
	@Autowired
	private LakeFlying fly01;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void showFly() {
		if (fly01 != null) {
			System.out.println(type+"오리가 ");
			fly01.fly();
		}
	}

}
