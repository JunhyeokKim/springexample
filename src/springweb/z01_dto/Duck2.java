package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;

public class Duck2 {
	private String type;
	// �ش� ������ ���� LakeFlying�� ������ type�� �ε��Ǿ� ������
	// �ڵ����� �Ҵ��ϼ���
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
			System.out.println(type+"������ ");
			fly01.fly();
		}
	}

}
