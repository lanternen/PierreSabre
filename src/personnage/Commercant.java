package personnage;
import personnage.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		
	}

	public int seFaireExtorquer() {
		int vol = getArgent();
		perdreArgent(vol);
		System.out.println("J'ai tout perdu ! Le monde est trop injuste...");
		return vol;
	}
	
	public void recevoirArgent(int argent) {
		gagnerArgent(argent);
		System.out.println(argent + " sous. Je te remercie généreux donateur !");
	}
	
	
}