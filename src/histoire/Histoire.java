package histoire;

import personnage.Humain;
import personnage.Commercant;

public class Histoire {

	public static void main(String[] args) {

		/*Humain prof = new Humain("Prof", "kombucha", 54);
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.perdreArgent(2);
		prof.acheter("kimono", 50);
		*/
		
		Commercant marchand = new Commercant("Marco", "thé", 20);
		
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoirArgent(15);
		marchand.boire();
		
		
	}

}
