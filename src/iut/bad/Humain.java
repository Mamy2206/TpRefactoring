package iut.bad;


public class Humain implements Consommation {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return nom + "" + prenom + "" + age;
	
	}
	
	public void manger() {
		System.out.println("je mange");
		
	}
	public void boir() {
		System.out.println("je bois");
		
	}
	public void ami(Humain autreHumain, int dureeDansJours) {
		System.out.println(this + " est ami avec  " +autreHumain+ " depuis " +dureeDansJours+ " jours");
	}
	
	public void ami(Humain auHumain) {
		ami(auHumain, 100);
	}

}
