package humans;

public class Human {
	int life;
	double velocity = 1.5;
	int atack;
	int armour;

	public Human(int life, int atack, int armour) {
		super();
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
	
	public int getAtack() {
		return atack;
	}
	
	public int getArmour() {
		return armour;
	}
	public void setArmour(int armour) {
		this.armour = armour;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	
}
