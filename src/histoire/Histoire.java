package histoire;

/*import personnage.Humain;
import personnage.Commercant;
import personnage.Yakuza;
import personnage.Ronin;*/

import personnage.*;

public class Histoire {

	public static void main(String[] args) {

		/*Humain prof = new Humain("Prof", "kombucha", 54);
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.perdreArgent(2);
		prof.acheter("kimono", 50);
		*/
		
		Commercant marchand = new Commercant("Marco", "th�", 20);
		
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoirArgent(15);
		marchand.boire();
		
		
		Yakuza yakuza = new Yakuza("Yaku le Noir", "Whiksy", 30, "Warsong");
		
		yakuza.direBonjour();
		yakuza.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yakuza.parler(marchand.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		yakuza.extorquer(marchand);	
		
		
		
		Ronin roro = new Ronin("Roro", "scochu", 60);
		
		roro.direBonjour();
		roro.donner(marchand);
		
		
		roro.provoquer(yakuza);
		
		
		
		
	}

}
