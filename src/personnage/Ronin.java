package personnage;
import personnage.Humain;


public class Ronin extends Humain {

	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
		// TODO Auto-generated constructor stub
	}

	public void donner(Commercant beneficiaire)
	{
		int don = getArgent() / 10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		beneficiaire.recevoirArgent(don);
	}
	
	
}
