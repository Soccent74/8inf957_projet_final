package strategy;

import wazo.Oiseau;

privileged aspect aspAlimentation pertarget (target(Oiseau) && call (void Oiseau.Nutrition())) {
	private int Oiseau.Alimentation = 0;
	
	public wazo.Oiseau.new(String couleur, int envergure, int nourriture, Deplacement deplacement){
		this.envergure = envergure;
		this.couleur = couleur;
		this.Alimentation = nourriture;
		this.deplacement = deplacement;
	}
	

	void around (Oiseau o) : target (o) && execution (void Oiseau.Nutrition()) {
		
		switch (o.Alimentation) {
			case 1: // perfectionnement � ex�cuter pour la strat�gie 1
					System.out.println("Je suis herbivore.");
				break;
			
			case 2: // perfectionnement � ex�cuter pour la strat�gie 2
				System.out.println("Je suis carnivore. grrrrrrr");
				break;
			
			default: System.out.println("Je suis omnivore.");; // ex�cution de la strat�gie par d�faut
		}
	}
}
