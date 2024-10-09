package calculatrice;

import java.util.Scanner;

public class Calculatrice {
    
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true; // Initialiser à true pour entrer dans la boucle

        // Boucle principale pour réaliser plusieurs calculs
        do {
            // Demander à l'utilisateur de saisir le premier nombre
            System.out.print("Entrez le premier nombre : ");
            double nombre1 = scanner.nextDouble();

            // Demander à l'utilisateur de saisir un opérateur (+, -, *, /)
            System.out.print("Entrez un opérateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);

            // Demander à l'utilisateur de saisir le deuxième nombre
            System.out.print("Entrez le deuxième nombre : ");
            double nombre2 = scanner.nextDouble();

            // Variable pour stocker le résultat
            double resultat = 0;

            // Effectuer l'opération en fonction de l'opérateur
            switch (operateur) {
                case '+':
                    resultat = nombre1 + nombre2;
                    break;
                case '-':
                    resultat = nombre1 - nombre2;
                    break;
                case '*':
                    resultat = nombre1 * nombre2;
                    break;
                case '/':
                    // Vérifier si le deuxième nombre n'est pas égal à zéro (éviter la division par zéro)
                    if (nombre2 != 0) {
                        resultat = nombre1 / nombre2;
                    } else {
                        System.out.println("Erreur : division par zéro impossible.");
                        continue; // Revenir au début de la boucle
                    }
                    break;
                default:
                    System.out.println("Erreur : opérateur non valide.");
                    continue; // Revenir au début de la boucle
            }

            // Afficher le résultat
            System.out.println("Le résultat est : " + resultat);

            // Demander à l'utilisateur s'il veut faire un autre calcul
            System.out.print("Voulez-vous faire un autre calcul ? (oui = 1, non = 0) : ");
            int reponse = scanner.nextInt();
            continuer = (reponse == 1); // Si la réponse est 1, continuer

        } while (continuer); // Continuer tant que l'utilisateur veut faire un autre calcul

        // Fermer le scanner
        System.out.println("Merci d'avoir utilisé la calculatrice !");
        scanner.close();
    }
}
