package main;

public class Skill {
	private String skill;
	private int num;
	
	public Skill(String s, int n) {
		num=n;
		skill=s;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
