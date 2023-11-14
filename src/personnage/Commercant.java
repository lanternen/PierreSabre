package personnage;
import personnage.Humain;

public class Commercant extends Humain {
	
	static String boissonFav = "thé";
	
	public Commercant(String nom, int argent) {
		super(nom, boissonFav, argent);
		
	}
	
	

	public int seFaireExtorquer() {
		int vol = getArgent();
		perdreArgent(vol);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return vol;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous. Je te remercie généreux donateur !");
	}
	
	
}