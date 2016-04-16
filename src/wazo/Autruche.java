package wazo;

import strategy.Courir;
import strategy.Deplacement;
import strategy.Herbivore;
import strategy.Marcher;
import strategy.Nourriture;

public class Autruche extends Oiseau{
	
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Autruche(){
		super("marron", 2, 0, new Marcher());
	}
	public Autruche(String couleur, int envergure,
			int nourriture, Deplacement deplacement) {
		super(couleur, envergure, 0, deplacement);
	}

	



}
