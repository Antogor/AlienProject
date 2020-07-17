package aliens;

public class Alien extends QueenAlien {
	private boolean stealth;
	private double velocity = 3.5;

	public Alien(int life, int atack, int armour) {
		super(life, atack, armour); //Set the life, atack... in the queen and gives to the new Alien
	}

	
	public boolean getStealth() {
		return stealth;
	}

	public void setStealth(boolean stealth) {
		this.stealth = stealth;
	}

	@Override
	public double movement(double distance) {
		return distance - this.velocity;
	}
	
	//Method catchHuman
	
}
