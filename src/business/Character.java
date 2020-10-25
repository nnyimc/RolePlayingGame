package business;

public abstract class Character {
	protected WeaponFeature weapon;
	protected Character() {
		
	}
	
	protected void setWeapon(WeaponFeature weapon) {
		this.weapon = weapon;
	}
}
