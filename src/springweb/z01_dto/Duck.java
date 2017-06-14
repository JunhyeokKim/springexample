package springweb.z01_dto;

// springweb.z01_dto.Duck
// springweb.z01_dto.Flyway
// springweb.z01_dto.LakeFlying
// springweb.z01_dto.SeaFlying
public class Duck {
	private String type;
	private Flyway fly;

	public String getType() {
		return type;
	}

	public Duck() {
	}

	public Duck(SeaFlying fly) {
		this.fly = fly;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Flyway getFly() {
		return fly;
	}

	// Flyway fly1 = new LakeFlying();
	// Flyway fly2 = new SeaFlying();
	public void setFly(LakeFlying fly) {
		this.fly = fly;
	}

	public void showFly() {
		System.out.println(type + "오리가");
		if (fly != null) {
			fly.fly();
		}
	}
}

interface Flyway {
	void fly();
}

class LakeFlying implements Flyway {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("호수 위를 나른다!!");
	}
}

class SeaFlying implements Flyway {
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("바다 위를 누빈다!!");
	}
}
