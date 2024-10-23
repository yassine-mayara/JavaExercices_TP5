package EX2;

public class Pepiniere {
    private static final int MAX_PLANTES = 1000;
    private Plante[] inventaire;
    private int nombreDePlantes;

    public Pepiniere() {
        this.inventaire = new Plante[MAX_PLANTES];
        this.nombreDePlantes = 0;
    }

    public void ajoutPlante(Plante plante) {
        if (nombreDePlantes < MAX_PLANTES) 
            inventaire[nombreDePlantes++] = plante;
        else 
            System.out.println("la pépinière est pleine");
        
    }

    public void afficherInventaire() {
        for (int i = 0; i < nombreDePlantes; i++) {
            inventaire[i].description();
            if (inventaire[i] instanceof Fleur) 
                ((Fleur) inventaire[i]).fleurir();
        }
    }

    public double totalAbsorptionTotaleCO2() {
        double total = 0;
        for (int i = 0; i < nombreDePlantes; i++)
            if (inventaire[i] instanceof Arbre) 
                total += ((Arbre) inventaire[i]).absorptionCO2();
        return total;
    }

    public int compterArbresCaduques() {
        int count = 0;
        for (int i = 0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof Arbre && 
                ((Arbre) inventaire[i]).getTypeFeuillage().equals("Caduque")) 
                count++;
        }
        return count;
    }
}

