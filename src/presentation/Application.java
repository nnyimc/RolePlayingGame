package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import business.King;
import business.WeaponFeature;

public class Application {
	private static final String PACKAGE_BUSINESS = "business.";
	public static void main(String[] args) {
		try {
			King kingKarool = (King) Class
								.forName(PACKAGE_BUSINESS + King.class.getSimpleName())
								.newInstance();
			
			System.out.println("Select a weapon: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String selectedWeapon = PACKAGE_BUSINESS + br.readLine();
			
			WeaponFeature weapon = (WeaponFeature) Class
									.forName(selectedWeapon)
									.newInstance();
			kingKarool.setWeapon(weapon);
			kingKarool.fight();
			
			System.out.println("Select a weapon: ");
			br = new BufferedReader(new InputStreamReader(System.in));
			selectedWeapon = PACKAGE_BUSINESS + br.readLine();
			weapon = (WeaponFeature) Class
					.forName(selectedWeapon)
					.newInstance();
			
			kingKarool.setWeapon(weapon);
			kingKarool.fight();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
