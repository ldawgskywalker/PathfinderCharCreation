package main;

public class Item {
	private String name;
	private String descript;
	
	public Item(String n, String d) {
		name=n;
		descript=d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}
	
}
