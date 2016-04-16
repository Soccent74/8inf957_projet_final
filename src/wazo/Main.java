package wazo;

import strategy.Omnivore;
import strategy.aspAlimentation.Nourriture;
import strategy.aspAlimentation.Oiseau;

public class Main {
	public static void main(String[] args) {
		  Oiseau[] tOis = {new Pigeon(), new Faucon(), new Autruche()};
		  
		  for(int i = 0; i < tOis.length; i++){
		    System.out.println("\nInstance de " + tOis[i].getClass().getName());
		    System.out.println("*****************************************");
		    //tOis[i].Nourriture = Omnivore();
		    setConcreteAlimentation(tOis[i], new Omnivore());
		    getConcreteAlimentation(tOis[i]);
		    tOis[i].Deplacement();
		  }
		}
}
