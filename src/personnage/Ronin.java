package personnage;
import personnage.Humain;


public class Ronin extends Humain {

	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		// TODO Auto-generated constructor stub
		this.honneur = honneur;
	}

	public void donner(Commercant beneficiaire)
	{
		int don = getArgent() / 10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		beneficiaire.recevoirArgent(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur * 2;
		int rep = adversaire.getReputation();
		
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		
		
		if (force >= rep) {
			honneur += 1;
			parler("Je t'ai eu petit yakuza !");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
		}
		else {
			honneur -= 1 ;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			int perte = getArgent();
			adversaire.gagner(perte);
		}
	}
	
	
}
