package EX2;

public class Plante {

    protected String nom;
    protected int hauteur,age;
    protected double prix;

    public Plante(String nom, int hauteur,int age, double prix){
        this.nom=nom;
        this.hauteur=hauteur;
        this.age=age;
        this.prix=prix;
    }

    public Plante (){
        this.nom="inconnu";
        this.hauteur=0;
        this.age=0;
        this.prix=0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "Nom : " + this.nom + " | Hauteur : " + this.hauteur + " cm | Age : " + this.age + " mois | Prix : " + this.prix + " DT";
    }

    public void description() {
        System.out.println(this.toString());
    }
    
}