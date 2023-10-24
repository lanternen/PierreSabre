package personnage;

public class Humain {

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	private String nom;
	private String boissonFav;
	private int argent;

	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}

	public String parler(String texte) {
		return "<< " + texte + " >>";
	}

	public void direBonjour(String texte) {
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
			parler("j'ai " + getArgent() + "sous en poche." + "Je vais pouvoir m'offrir une boisson à 12 sous.\n");
		}

	}

}
