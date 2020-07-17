package run;

import java.util.ArrayList;
import java.util.List;

import aliens.Alien;
import aliens.Egg;
import aliens.QueenAlien;

public class Tests {
	static List<Alien> aliens = new ArrayList<>();
	public static void main(String[] args) {
		QueenAlien queen = new QueenAlien((int)(Math.random()*300+200), (int)(Math.random()*100+50), (int)(Math.random()*75+25));
		
		int num = 3;
		
		List<Egg> eggs = queen.eggs(num);
		eggs.forEach(e->aliens.add(e.aliens(true, queen.getLife()/2, queen.getAtack()/2, queen.getArmour()*2)));
		
		System.out.println("Queen "+queen.getLife()+" Atack "+queen.getAtack()+" Armour "+queen.getArmour());
		System.out.println("Alien "+aliens.get(0).getLife()+" Atack "+aliens.get(0).getAtack()+" Armour "+aliens.get(0).getArmour());
	}
	
}
