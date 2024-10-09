package exposant;

import java.util.Scanner;

public class Exposant2 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre N : ");
        double N = scanner.nextDouble(); // Utiliser double pour prendre en compte les nombres à virgule

        // Demander à l'utilisateur de saisir l'exposant
        System.out.print("Entrez l'exposant que vous souhaitez calculer : ");
        int exposant = scanner.nextInt(); // Utiliser int pour l'exposant

        // Initialiser le résultat à 1 (valeur neutre pour la multiplication)
        double resultat = 1;

        // Calculer N élevé à la puissance de l'exposant en utilisant une boucle for
        for (int i = 0; i < exposant; i++) {
            resultat *= N; // Multiplier le résultat par N à chaque itération
        }

        // Afficher le résultat
        System.out.println(N + " élevé à la puissance " + exposant + " est : " + resultat);

        // Fermer le scanner
        scanner.close();
    }
}
