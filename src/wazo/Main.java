package wazo;

import strategy.Marcher;
import strategy.Omnivore;
//import strategy.aspAlimentation.Nourriture;
//import strategy.aspAlimentation.Oiseau;

public class Main {
	public static void main(String[] args) {
		  Oiseau[] tOis = {new Pigeon(), new Faucon(), new Pigeon(), new Autruche()};
		  
		  for(int i = 0; i < tOis.length; i++){
		    System.out.println("\nInstance de " + tOis[i].getClass().getName());
		    System.out.println("*****************************************");
		    tOis[i].Nutrition();
		  }
		}
}
