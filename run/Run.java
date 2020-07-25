package run;

import java.util.ArrayList;
import java.util.List;

import aliens.Alien;
import aliens.Egg;
import aliens.QueenAlien;
import humans.Human;
import humans.Marine;
import weapons.Rifle;
import weapons.WeaponType;

public class Run {
	
	QueenAlien queen;
	List<Egg> eggs;
	List<Alien> aliens = new ArrayList<>();
	List<Human> humans = new ArrayList<>();	
	
	public Run(int num) {
		this.queen = new QueenAlien((int)(Math.random()*300+200), (int)(Math.random()*100+50), (int)(Math.random()*75+25));
		this.eggs = this.queen.eggs(num);
	//	this.humans;
		
	}
	
	public void setAliens(boolean infect) {
		this.eggs.forEach(e->this.aliens.add(e.aliens(infect, this.queen.getLife()/2, this.queen.getAtack()/2, this.queen.getArmour()*2)));
	}
	
	public int atacks(boolean isAtatack, int armour, int atack) {
		
	}
	
	private int damage(int enemyArmour, int atack) {
		
	}
	
	private boolean distance(double range, double velocity) {
		
	}
//	Marine m = new Marine(5, 6, 7, 10);
	
	//WeaponType r = new Rifle();
	
	
}
