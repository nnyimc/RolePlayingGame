package business;

public class King extends Character {
	public King() {
		super();
	}
	
	public void setWeapon(WeaponFeature weapon) {
		super.setWeapon(weapon);	
	}
	
	
	public void fight() {
		weapon.useWeapon();
	}
}
