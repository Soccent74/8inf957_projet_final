package wazo;

import strategy.Deplacement;
import strategy.Marcher;
import strategy.Nourriture;
import strategy.Omnivore;

public class Oiseau {
	/*** VARIABLES ***/
	private int envergure = 0;
	private String couleur = "";
	// COMPORTEMENT PAR DEFAUT
	public Deplacement deplacement;
	
	
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Oiseau(){}
	public Oiseau(String couleur, int envergure, Deplacement deplacement){
		this.envergure = envergure;
		this.couleur = couleur;
		this.deplacement = deplacement;
	}
	// GETTERS
	public int getEnvergure(){return envergure;}
	public String getCouleur(){return couleur;}
	// SETTERS
	public void setEnvergure(int envergure){this.envergure = envergure;}
	public void setCouleur(String couleur){this.couleur = couleur;}
	public void setDeplacement(Deplacement deplacement){this.deplacement = deplacement;}
	//public void setNutrition(Nourriture nourriture){this.nourriture = nourriture;}
	
	public void Deplacement(){
		deplacement.seDeplacer();
	}
	public void Nutrition(){
		System.out.println("Test de nutrition.");
	}
	
}
