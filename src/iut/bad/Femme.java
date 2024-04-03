package iut.bad;

public class Femme extends Humain {
	
	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	public static void main(String[] args) {
		Homme homme = new Homme("Mamy", "Niaina", 22);
		Femme femme = new Femme("Julie", "Rachel", 18);
		homme.ami(femme);
		
		
	}
	

}
