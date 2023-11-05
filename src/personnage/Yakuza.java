package personnage;
import personnage.Humain;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	
	public void extorquer(Commercant victime) {
		this.reputation++;
		int gain = victime.getArgent();
		gagnerArgent(gain);
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + gain + " sous de " + victime.getNom()+ ", ce qui me fait "+ getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	
	
	
	
}
