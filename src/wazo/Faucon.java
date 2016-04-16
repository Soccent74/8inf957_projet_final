package wazo;

import strategy.Carnivore;
import strategy.Deplacement;
import strategy.Nourriture;
import strategy.Voler;

public class Faucon extends Oiseau{
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Faucon(){
		this.nourriture = new Carnivore();
		this.deplacement = new Voler();
	}
	public Faucon(String nom, String couleur, int envergure,
			Nourriture nourriture, Deplacement deplacement) {
		super(nom, couleur, envergure, nourriture, deplacement);
	}





}
