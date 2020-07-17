package aliens;

public class Egg {
	private int life = 2;
	private double timeOpen, radius = 2.5;
	
	public double getTimeOpen() {
		return timeOpen;
	}
	public void setTimeOpen(double timeOpen) {
		this.timeOpen = timeOpen;
	}

	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	public boolean infectHumans(double distance) {
		return distance <= radius && timeOpen == 0 ? true : false;
	}
	
	public Alien aliens(boolean infect, int life, int atack, int armour){
		return infect == true ? new Alien(life, atack, armour): null;
	}
	
}
