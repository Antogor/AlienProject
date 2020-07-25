package weapons;

public class Rifle extends WeaponType{

	int amountShot;
	
	public Rifle(int municion, int damage, double range, boolean efectivity, int amount) {
		super(municion, damage, range, efectivity);
		this.amountShot = amount;
	}


}
