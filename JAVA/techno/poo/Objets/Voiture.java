package Objets;

public class Voiture {
    String marque;
    String couleur;
    int nbPortes;
    boolean isStart;
    int vitesse;

    // CONSTRUCTEUR
    public Voiture(String marque, String couleur, int nbPortes) {
        this.marque = marque;
        this.couleur = couleur;
        this.nbPortes = nbPortes;
        isStart = false;
        vitesse = 0;
    }

    // METHODE
    // Démarrer
    public void demarrer(){
        isStart = true;
    }
    // Arreter
    public void arreter(){
        isStart = false;
    }
    // Accelerer
    public void accelerer(int acc){
        if (isStart) {
            vitesse += acc;
            if (vitesse > 10) {
                vitesse = 10;
            }
        }
    }
    // Ralentir
    public void ralentir( int ral){
        vitesse -= ral;
        if (vitesse - ral < 0) {
            vitesse = 0;
        }
    }

    // Redéfinition de la méthode toString pour afficher les infos de la voiture
    @Override
    public String toString() {
        return "Marque : " + marque + ", Couleur : " + couleur + "nbPortes : " + nbPortes + ", En marche : " + (isStart ? "Oui, " : "Non, ") + "vitesse : " + vitesse;
    }
}
