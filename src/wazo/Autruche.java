package wazo;

import strategy.Courir;
import strategy.Deplacement;
import strategy.Herbivore;
import strategy.Nourriture;

public class Autruche extends Oiseau{
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Autruche(){
		this.nourriture = new Herbivore();
		this.deplacement = new Courir();
	}
	public Autruche(String nom, String couleur, int envergure,
			Nourriture nourriture, Deplacement deplacement) {
		super(nom, couleur, envergure, nourriture, deplacement);
	}

	



}
