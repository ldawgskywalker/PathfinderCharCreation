package main;
import java.io.*;
import java.util.ArrayList;
public class Gen {
	private String cla;
	private String race;
	private int bhp;
	private int level;
	private int bab;
	private int armour;
	private ArrayList<Skill> skills;
	private ArrayList<Mod> mods;
	private ArrayList<Trait> traits;
	
	public Gen(String c, String r) {
		cla=c;
		race=r;
		skills=new ArrayList<Skill>();
		mods=new ArrayList<Mod>();
		traits=new ArrayList<Trait>();
		level=1;
		armour=10;
		bab=0;
	}

	
	public int getBhp() {
		return bhp;
	}


	public void setBhp(int bhp) {
		this.bhp = bhp;
	}


	public int getArmour() {
		return armour;
	}


	public void setArmour(int armour) {
		this.armour = armour;
	}


	public int getBab() {
		return bab;
	}


	public void setBab(int bab) {
		this.bab = bab;
	}


	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}

	public ArrayList<Mod> getMods() {
		return mods;
	}

	public void setMods(ArrayList<Mod> mods) {
		this.mods = mods;
	}
	public int getBHp() {
		return bhp;
	}


	public void setBHp(int hp) {
		this.bhp = hp;
	}

	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public ArrayList<Trait> getTraits() {
		return traits;
	}


	public void setTraits(ArrayList<Trait> traits) {
		this.traits = traits;
	}
	//user input
	public void setSkills(int s, int d, int con, int i, int w, int cha) {
		skills.add(new Skill("Strength", s));
		skills.add(new Skill("Dexterity", d));
		skills.add(new Skill("Constitution", con));
		skills.add(new Skill("Intellegence", i));
		skills.add(new Skill("Wisdom", w));
		skills.add(new Skill("Charisma", cha));
	}
	//random
	public void setSkills() {
		int temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Strength", temp));
		
		temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Dexterity", temp));
		
		temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Constitution", temp));
		
		temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Intellegence", temp));
		
		temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Wisdom", temp));
		
		temp = ((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1)+((int) (Math.random()*6)+1);
		skills.add(new Skill("Charisma", temp));
	}
	
	public void setMods() {
		mods.add(new Mod("Str", skills.get(0).getNum()));
		mods.add(new Mod("Dex", skills.get(1).getNum()));
		mods.add(new Mod("Con", skills.get(2).getNum()));
		mods.add(new Mod("Int", skills.get(3).getNum()));
		mods.add(new Mod("Wis", skills.get(4).getNum()));
		mods.add(new Mod("Cha", skills.get(5).getNum()));
	}
	
	public void abilities() throws IOException{
		BufferedReader r = new BufferedReader(new FileReader(race));
		
		
		String text = r.readLine();
		while(text!=null) {
			if(text.equals("Strength")||text.equals("Dexterity")||text.equals("Constitution")||text.equals("Intellegence")||text.equals("Wisdom")||text.equals("Charisma")) {
				int index=0;
				for(int i=0;i<skills.size();i++) {
					if(text.equals(skills.get(i).getSkill()))
						index=i;
				}
				text=r.readLine();
				if(text.equals("-")) {
					text = r.readLine();
					skills.set(index, new Skill(skills.get(index).getSkill(),skills.get(index).getNum()-(Integer.parseInt(text))));
				}
				else {
					text = r.readLine();
					skills.set(index, new Skill(skills.get(index).getSkill(),skills.get(index).getNum()+(Integer.parseInt(text))));
				}
			}
			else if(text.equals("AC")) {
				text=r.readLine();
				if(text.contentEquals("+")) {
					text=r.readLine();
					armour+= Integer.parseInt(text);
				}
				else {
					text=r.readLine();
					armour-= Integer.parseInt(text);
				}
			}
			else
				traits.add(new Trait(text,r.readLine()));
			text = r.readLine();
		}
		
		r.close();
	
	}
	
	public void feats() throws IOException {
		BufferedReader c = new BufferedReader(new FileReader(cla));
		
		String text = c.readLine();
		bab=Integer.parseInt(text);
		text = c.readLine();
		calcHP(Integer.parseInt(text));
		text=c.readLine();
		while(text!=null) {
			traits.add(new Trait(text,c.readLine()));
			text=c.readLine();
		}
		
		c.close();
		
	}
	
	public void calcHP(int hd) {
		//hit die plus con mod
		bhp=((int)(Math.random()*hd)+1)+mods.get(2).getMod();
	}
	
	public void printSkills(int i) {
		System.out.println(skills.get(i).getSkill()+"\t"+skills.get(i).getNum());
	}
	public void printMods(int i) {
		System.out.println(mods.get(i).getSkill()+"\t"+mods.get(i).getMod());
	}
	public void printTraits(int i) {
		System.out.println(traits.get(i).getTitle()+"\t"+traits.get(i).getDescr());
	}





	
	
	
}
