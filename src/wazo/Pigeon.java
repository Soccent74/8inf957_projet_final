package wazo;

import strategy.Deplacement;
import strategy.Marcher;
import strategy.Nourriture;
import strategy.Omnivore;

public class Pigeon extends Oiseau{
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Pigeon(){
		this.nourriture = new Omnivore();
		this.deplacement = new Marcher();
	}
	public Pigeon(String nom, String couleur, int envergure,
			Nourriture nourriture, Deplacement deplacement) {
		super(nom, couleur, envergure, nourriture, deplacement);
	}



}
