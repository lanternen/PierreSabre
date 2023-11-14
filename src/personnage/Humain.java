package personnage;

public class Humain {

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	final int taille = 30;
	
	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissances;
	protected String listeConnaissances[] = new String[taille];

	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + " " + texte + " ");
	}

	public void direBonjour() {
		parler("Bonjour, je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("j'ai " + getArgent() + "sous en poche." + "Je vais pouvoir m'offrir un "+ bien +" � " + prix +" sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + getArgent() + "sous en poche. " + "Je ne peux meme pas m'offrir un " + bien +" � " + prix+ "sous.");
		}
	}

	
	private void memoriser(Humain humain) {
		if (nbConnaissances == taille) {
			for (int i = 0; i<taille -1; i++)
			{
				listeConnaissances[i] = listeConnaissances[i+1];
			}
			nbConnaissances -= 1;
		}
		
		listeConnaissances[nbConnaissances] = humain.getNom();
		nbConnaissances += 1;
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		
		String connaissances = "";
		
		for (int i = 0; i<nbConnaissances; i++) {
			connaissances += listeConnaissances[i];
		}
		
		parler("Je connais beaucoup de monde dont : " + connaissances + ".");
//		for (int i = 0; i <nbConnaissances; i++) {
//			System.out.print(listeConnaissances[i]);
//			
//			if (i < nbConnaissances -1) {
//				System.out.print(", ");
//			}
//			else {
//				System.out.println(".");
//			}
//		}
	}
	
	
}
