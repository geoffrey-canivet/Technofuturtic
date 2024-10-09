package exposant;

import java.util.Scanner;

public class Exposant {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre
        System.out.print("Entrez un nombre N : ");
        double N = scanner.nextDouble(); // Utiliser double pour prendre en compte les nombres à virgule

        // Initialiser le résultat à 1 (valeur neutre pour la multiplication)
        double resultat = 1;

        // Calculer N^10 en utilisant une boucle for
        for (int i = 0; i < 10; i++) {
            resultat *= N; // Multiplier le résultat par N à chaque itération
        }

        // Afficher le résultat
        System.out.println("Le résultat de " + N + " élevé à la puissance 10 est : " + resultat);

        // Fermer le scanner
        scanner.close();
    }
}

