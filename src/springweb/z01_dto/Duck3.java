package springweb.z01_dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Duck3 {
	private String type;
	// �ش� ������ ���� LakeFlying�� ������ type�� �ε��Ǿ� ������
	// �ڵ����� �Ҵ��ϼ���
	@Autowired(required = false)	// �޸𸮿� �ε����� ���� ��ü�� ���� ���� ���� ���� (default=true)
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
			System.out.println(type + "������ ");
			fly.fly();
		}
	}

}
