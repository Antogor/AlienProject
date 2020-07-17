package aliens;

import java.util.ArrayList;
import java.util.List;

public class QueenAlien {
	private int life, atack, armour;
	private double velocity = 1.5;
	
	public QueenAlien() {
		
	}
	
	public QueenAlien(int life, int atack, int armour) {
		this.life = life;
		this.atack = atack;
		this.armour = armour;
	}
	
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
	}

	
	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int damage (int enemyArmour) {
		int totalDamage = this.atack - enemyArmour;
		return totalDamage;
	}
	
	public double movement(double distance) {
		return distance - this.velocity;
	}

	public List<Egg> eggs(int numEggs) {
		List<Egg> e = new ArrayList<>();
		for (int i = 0; i < numEggs; i++)
			e.add(new Egg());
		return e;
	}
}
