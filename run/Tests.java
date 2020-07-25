package run;

import java.util.ArrayList;
import java.util.List;

import aliens.Alien;
import aliens.Egg;
import aliens.QueenAlien;
import humans.Civil;
import humans.Marine;
import weapons.Rifle;
import weapons.WeaponType;
import weapons.Weapons;

public class Tests {
	static Run r = new Run(3);
	public static void main(String[] args) {
		
		System.out.println("Queen "+r.queen.getLife()+" Atack "+r.queen.getAtack()+" Armour "+r.queen.getArmour());
		r.setAliens(true);
		System.out.println("Alien "+r.aliens.get(0).getLife()+" Atack "+r.aliens.get(0).getAtack()+" Armour "+r.aliens.get(0).getArmour());
		
		//Civil c = new Civil(5, 6, 5);
		
		//System.out.println(c.getArmour());
		
		Marine m = new Marine(5, 6, 7, 10);
		
		WeaponType r = new Rifle();
		
		System.out.println(m.damage(r));
	}
	
}
