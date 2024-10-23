package EX2;


    public class Fleur extends Plante {

    private String couleur;
    private int moisF;

    public Fleur(String nom, int hauteur, int age, double prix, String couleur, int moisF) {
        super(nom, hauteur, age, prix);
        this.couleur = couleur;
        this.moisF = moisF;
    }

    public String getCouleur() {
        return couleur;
    }

    public void description() {
        super.description();
        System.out.println(" | Couleur : " + couleur);
    }

    public void fleurir() {
        if (moisF == 4 || moisF == 5 || moisF == 6) 
            System.out.println("La fleur est en fleurs");
        else 
            System.out.println("La fleur n'est pas en fleurs");
        
    }
}

