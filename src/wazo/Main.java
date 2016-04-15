package wazo;

public class Main {
	public static void main(String[] args) {
		  Oiseau[] tOis = {new Pigeon(), new Faucon(), new Autruche()};
		  
		  for(int i = 0; i < tOis.length; i++){
		    System.out.println("\nInstance de " + tOis[i].getClass().getName());
		    System.out.println("*****************************************");
		    tOis[i].Nutrition();
		    tOis[i].Deplacement();
		  }
		}
}
