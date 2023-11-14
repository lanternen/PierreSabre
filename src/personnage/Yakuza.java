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
	
	public int getReputation() {
		// TODO Auto-generated method stub
		return reputation;
	}
	
	
	public void gagner(int gain){
		gagnerArgent(gain);
		reputation = getReputation() +1 ;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		
	}

	public int perdre() {
		reputation = getReputation() - 1;
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan);
		return getArgent();
	}


	@Override
	public void direBonjour() {
		// TODO Auto-generated method stub
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}
	
	
	
	
}
