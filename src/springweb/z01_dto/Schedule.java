package springweb.z01_dto;

public class Schedule {
private String time;
private String info;

public Schedule() {
	// TODO Auto-generated constructor stub
}
public Schedule(String time, String info) {
	super();
	this.time = time;
	this.info = info;
}

public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}


}
