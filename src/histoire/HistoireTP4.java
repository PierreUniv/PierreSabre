package histoire;

import personnages.humain;

public class HistoireTP4 {

	public HistoireTP4() {

	}

	public static void main(String[] args) {
		humain prof= new humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson",12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.acheter("komono",50);

	}

}
