package springweb.z01_dto;

import java.util.ArrayList;

public class DailySchedule {
	private String date;
	private ArrayList<Schedule> schList;

	public String getDate() {
		return date;
	}

	public ArrayList<Schedule> getSchList() {
		return schList;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setSchList(ArrayList<Schedule> schList) {
		this.schList = schList;
	}
	
	public void showSchedule(){
		System.out.println(date+" ÀÏ°ú °èÈ¹");
		for(Schedule sch:schList){
			System.out.println(sch.getTime()+" "+ sch.getInfo());
		}
	}
}
