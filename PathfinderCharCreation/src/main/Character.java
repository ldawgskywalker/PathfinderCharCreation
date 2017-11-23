package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Character{
	private int money;
	private int currhp;
	private String gender, align, player, name;
	private Gen gen;
	private ArrayList<Item> bag;
	private ArrayList<Weapon> weapons;
	private ArrayList<Note> notes;
	
	public Character(String c, String r, String gend, String al, String p, String n) {
		gen = new Gen(c,r);
		name=n;
		gender=gend;
		align=al;
		player=p;
		bag=new ArrayList<Item>();
		weapons=new ArrayList<Weapon>();
		notes=new ArrayList<Note>();
	}
	public Character(String p) throws IOException {		
		gen = new Gen(randClass(), randRace());
		player=p;
		
		randName();
		
		gen.setSkills();
		gen.setMods();
		gen.feats();
		currhp=gen.getBHp();
		
				
	}
	
	
	public int getCurrhp() {
		return currhp;
	}
	public void setCurrhp(int currhp) {
		this.currhp = currhp;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}

	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public Gen getGen() {
		return gen;
	}

	public void setGen(Gen gen) {
		this.gen = gen;
	}

	public ArrayList<Item> getBag() {
		return bag;
	}

	public void setBag(ArrayList<Item> bag) {
		this.bag = bag;
	}
	
	public void addWeapon(int cost, String name, int d, int a, int c, String r) {
		if(cost>money)
			System.out.println("Not enough money!");
		else {
			money=money-cost;
			weapons.add(new Weapon(name,d,r,a,c));
		}
	}
	
	public void randName() throws IOException{
		ArrayList<String> names = new ArrayList<String>();
		
		double temp = (Math.random());
		
		if(temp>0.5)
			gender="Male";
		else
			gender="Female";
		
		BufferedReader doc = new BufferedReader(new FileReader(gender));
		
		String text = doc.readLine();
		while(text!=null) {
			names.add(text);
			text=doc.readLine();
		}
		int n= (int)(Math.random()*gender.length());
		name = names.get(n);
		
		
		doc.close();
	}
	
	public String randRace() {
		String[] RList = {"DWARF","ELF","GNOME","ROGUE"};
				
		return RList[(int)(Math.random()*RList.length)];
	}
	public String randClass() {
		String[] CList = {"ROGUE","CLERIC"};
		
		return CList[(int)(Math.random()*CList.length)];
	}
	
	public void addNotes(String s) {
		notes.add(new Note(s));
	}
	
	public void printNotes(int i) {
		System.out.println(i+1+"."+notes.get(i).getTimeStamp()+"\t"+notes.get(i).getNo());
	}
	
	
}
