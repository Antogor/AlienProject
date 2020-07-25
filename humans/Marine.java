package humans;

import weapons.WeaponType;

public class Marine extends Human {
	int training;
	public Marine(int life, int atack, int armour, int training) {
		super(life, atack, armour);
		this.training = training;
	}

	public int damage(WeaponType type) {
		return this.atack + type.getDamage();
	}
}
