package JAVA.techno.Comparaison;

import java.util.Scanner;

public class Comparaison {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Lire les deux nombres de l'utilisateur
        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();
        
        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        // Comparer les deux nombres et afficher les messages correspondants
        if (b < a) {
            System.out.println("C'est plus");
        } else if (b > a) {
            System.out.println("C'est moins");
        } else {
            System.out.println("C'est gagné");
        }

        // Fermer le scanner
        scanner.close();
    }
}
