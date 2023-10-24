package histoire;

import personnage.Humain;

public class Histoire {

	public static void main(String[] args) {

		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.parler(
				"j'ai " + prof.getArgent() + "sous en poche." + "Je vais pouvoir m'offrir une boisson à 12 sous.\n");
		prof.perdreArgent(12);
		prof.boire();
		prof.parler("j'ai " + prof.getArgent() + "sous en poche." + "Je vais pouvoir m'offrir un jeu à 2 sous.\n");
		prof.perdreArgent(2);
		prof.parler("Je n'ai plus que " + prof.getArgent() + "sous en poche. "
				+ "Je ne peux meme pas m'offrir un kimono à 50 sous.\n");

	}

}
