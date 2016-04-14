package wazo;

public class Oiseau {
	// VARIABLES
	int envergure = 0;
	String nom = "";
	String couleur = "";
	
	// METHODES
	public Oiseau(String nom, String couleur, int envergure){ // CONSTRUCTEUR
		this.envergure = envergure;
		this.nom = nom;
		this.couleur = couleur;
	}
	
	// GETTERS / SETTERS
	public int getEnvergure(){return envergure;}
	public String getNom(){return nom;}
	public String getCouleur(){return couleur;}
	
	public void setEnvergure(int envergure){this.envergure = envergure;}
	public void setNom(String nom){this.nom = nom;}
	public void setCouleur(String couleur){this.couleur = couleur;}
	
	//INTERFACE
	public void Deplacement(){}
	public void Nutrition(){}
	
}
