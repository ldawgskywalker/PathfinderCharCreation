package main;

import java.io.*;
import java.util.Scanner;

public class Creator {
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("****************WELCOME TO THE PATHFINDER CHARACTER GEN*****************");
		System.out.println("***THIS GENERATOR WILL TAKE YOUR INPUTS, OR CREATE A RANDOM CHARACTER***");
		
		System.out.print("TYPE 1 FOR A RANDOM CHARACTER, OR 2 TO MAKE ONE YOURSELF: ");
			String dec = kb.nextLine();
		Character cha=null;
		while(!dec.equals("1")&&!dec.equals("2")) {
			System.out.print("Please input 1 or 2:");
				dec = kb.nextLine();
		}
		System.out.print("Please input your name: ");
			String player = kb.nextLine();
			
		if(dec.equals("2")) {
			System.out.print("Which class would you like to play?");
				String cl=kb.nextLine();
			
			System.out.print("Which race would you like to play?");
				String race=kb.nextLine();
			
			System.out.print("What is the character's gender?");
				String gender = kb.nextLine();
				
			System.out.print("What is your alignment?");
				String al = kb.nextLine();
			
			System.out.print("What is your character's name?");
				String ch = kb.nextLine();
			
			cha = new Character(cl,race,gender,al,player,ch);
			
			System.out.print("If you would like to input your own ability scores input 1, or if you like your scores randomized press 2.");
				dec = kb.nextLine();
			
			if(dec.equals("2")) {
				cha.getGen().setSkills();
			cha.getGen().setMods();
			}
			else {
				System.out.print("Strength: ");
					int s = kb.nextInt();
				System.out.print("Dexterity: ");
					int d = kb.nextInt();
				System.out.print("Constitution: ");
					int con = kb.nextInt();
				System.out.print("Intellegence: ");
					int i = kb.nextInt();
				System.out.print("Wisdom: ");
					int w = kb.nextInt();
				System.out.print("Charisma: ");
					int chari = kb.nextInt();
				
				cha.getGen().setSkills(s, d, con, i, w, chari);
				cha.getGen().setMods();
			}

		}
		else {
			cha=new Character(player);
		}
		
		cha.getGen().feats();
	
		cha.getGen().abilities();
		System.out.println("Name: "+cha.getName());
		System.out.println("Class: "+cha.getGen().getCla());
		System.out.println("HP: "+cha.getGen().getBHp());
		System.out.println("Gender: "+cha.getGender());
		System.out.println("AB: "+cha.getGen().getBab());
		
		for(int i=0;i<cha.getGen().getSkills().size(); i++)
			cha.getGen().printSkills(i);
		
		
		
		for(int i=0;i<cha.getGen().getMods().size(); i++)
			cha.getGen().printMods(i);
		
		
		for(int i=0;i<cha.getGen().getTraits().size(); i++)
			cha.getGen().printTraits(i);
		
		kb.close();
		
	}
	
}
