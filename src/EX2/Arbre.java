package EX2;

public class Arbre extends Plante {
    private String typeFeuillage;
    private final double AbsorMoyenne = 22;

    public Arbre(String nom, int hauteur, int age, double prix, String typeFeuillage) {
        super(nom, hauteur, age, prix);
        this.typeFeuillage = typeFeuillage;
    }

    public void description() {
        super.description();
        System.out.println(" | Type de feuillage : " + typeFeuillage);
    }

    public double absorptionCO2() {
        if (super.hauteur > 50) 
            return AbsorMoyenne + 3;
        else 
            return AbsorMoyenne;
        
    }

    public String getTypeFeuillage() {
        return typeFeuillage;
    }
}

