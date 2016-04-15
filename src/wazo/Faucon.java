package wazo;

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
