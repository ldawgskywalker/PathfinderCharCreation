package main;

public class Trait {
	private String title;
	private String descr;
	
	public Trait(String t, String d) {
		title=t;
		descr=d;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
