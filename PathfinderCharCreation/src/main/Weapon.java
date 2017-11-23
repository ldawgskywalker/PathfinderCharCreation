package main;

public class Weapon {
	private String name;
	private int dice;
	private String range;
	private int ab;
	private int crit;
	
	public Weapon(String n, int d, String r, int a, int c) {
		name=n;
		dice=d;
		range=r;
		ab=a;
		crit=c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public int getAb() {
		return ab;
	}

	public void setAb(int ab) {
		this.ab = ab;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}
	
	
}
