package weapons;

public class WeaponType implements Weapons {

	int municion;
	int damage;
	double range;
	boolean efectivity;

	public WeaponType(int municion, int damage, double range, boolean efectivity) {
		this.municion = municion;
		this.damage = damage;
		this.range = range;
		this.efectivity = efectivity;
	}

	public int getDamage() {
		return damage;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}

	public double getRange() {
		return range;
	}

	@Override
	public boolean municion(int bullets) {
		return bullets == 0 ? false:true;
	}
}
