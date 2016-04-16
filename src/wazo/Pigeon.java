package wazo;

import strategy.Deplacement;
import strategy.Marcher;
import strategy.Nourriture;
import strategy.Omnivore;

public class Pigeon extends Oiseau{
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Pigeon(){
		super("marron", 2, 1, new Marcher());
	}
	public Pigeon(String couleur, int envergure, Deplacement deplacement) {
		super(couleur, envergure, 1, deplacement);
	}



}
