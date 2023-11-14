package histoire;

import personnage.Commercant;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP5 {

	
	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		
		Yakuza yaku = new Yakuza("Yaku le Noir", "Whiksy", 30, "Warsong");
		
		Ronin roro = new Ronin("Roro", "scochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		yaku.listerConnaissance();
		
		
	}
}
