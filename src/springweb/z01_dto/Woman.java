package springweb.z01_dto;

public class Woman {
	private String name;
	private int age;
	private String loc;

	public Woman() {
		// TODO Auto-generated constructor stub
	}

	public Woman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
