package wazo;

import strategy.Carnivore;
import strategy.Deplacement;
import strategy.Marcher;
import strategy.Nourriture;
import strategy.Voler;

public class Faucon extends Oiseau{
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Faucon(){
		super("marron", 2, 2, new Marcher());
	}
	public Faucon(String couleur, int envergure,
			int nourriture, Deplacement deplacement) {
		super(couleur, envergure, 2, deplacement);
	}





}
