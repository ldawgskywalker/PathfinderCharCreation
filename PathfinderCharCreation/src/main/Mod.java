package main;

public class Mod {
	private int mod;
	private String skill;
	public Mod(String s, int n) {
		skill=s;
		if(n==1)
			mod=-5;
		else if(n==2||n==3)
			mod=-4;
		else if(n==4||n==5)
			mod=-3;
		else if(n==6||n==7)
			mod=-2;
		else if(n==8||n==9)
			mod=-1;
		else if(n==10||n==11)
			mod=0;
		else if(n==12||n==13)
			mod=1;
		else if(n==14||n==15)
			mod=2;
		else if(n==16||n==17)
			mod=3;
		else if(n==18||n==19)
			mod=4;
		else if(n==20||n==21)
			mod=5;
		
	}
	public int getMod() {
		return mod;
	}
	public void setMod(int mod) {
		this.mod = mod;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
}
