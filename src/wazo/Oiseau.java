package wazo;

public class Oiseau {
	/*** VARIABLES ***/
	private int envergure = 0;
	private String nom = "";
	private String couleur = "";
	// COMPORTEMENT PAR DEFAUT
	protected Nourriture nourriture = new Omnivore();
	protected Deplacement deplacement = new Marcher();
	
	
	/*** METHODES ***/
	// CONSTRUCTEURS
	public Oiseau(){}
	public Oiseau(String nom, String couleur, int envergure, Nourriture nourriture, 
			Deplacement deplacement){
		this.envergure = envergure;
		this.nom = nom;
		this.couleur = couleur;
		this.nourriture = nourriture;
		this.deplacement = deplacement;
	}
	// GETTERS
	public int getEnvergure(){return envergure;}
	public String getNom(){return nom;}
	public String getCouleur(){return couleur;}
	// SETTERS
	public void setEnvergure(int envergure){this.envergure = envergure;}
	public void setNom(String nom){this.nom = nom;}
	public void setCouleur(String couleur){this.couleur = couleur;}
	public void setDeplacement(Deplacement deplacement){this.deplacement = deplacement;}
	public void setNutrition(Nourriture nourriture){this.nourriture = nourriture;}
	
	public void Deplacement(){
		deplacement.seDeplacer();
	}
	public void Nutrition(){
		nourriture.seNourrir();
	}
	
}
