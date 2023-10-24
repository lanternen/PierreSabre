package personnage;
import personnage.Humain;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan, int reputation) {
		super(nom, boissonFav, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	
	void extorquer(Commercant victime) {
		reputation++;
		int gain = victime.getArgent();
		victime.seFaireExtorquer();
	}
	
	
	
	
	
}
