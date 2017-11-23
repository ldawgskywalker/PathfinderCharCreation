package main;
import java.text.SimpleDateFormat;
import java.util.*;
public class Note {
	private String timeStamp;
	private String no;
	public Note(String n) {
		timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
		no=n;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
