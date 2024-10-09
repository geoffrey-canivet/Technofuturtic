package ForTableau;

import java.util.Scanner;

/*
• Écrire un algorithme demandant à l’utilisateur le nombre de joueurs (max 10
joueurs). Ensuite, l’algorithme doit demander à l’utilisateur le score de chaque
joueur. Une fois ceci fini, il faut afficher la moyenne des scores.
Testez-l’algorithme avec Flowgorithm
*/
public class Exo1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int nbPlayer;
        do {
            System.out.println("Combien de joueur : ");
            nbPlayer = sc.nextInt();
        } while (nbPlayer > 10);
        var tb = new int[nbPlayer];

        int sum = 0;
        for (int i = 0; i < nbPlayer; i++) {
            System.out.printf("Entrez le score du joueur " + i + " : ");
            tb[i] = sc.nextInt();
            sum += tb[i];
        }
        System.out.println("Moyenne : " + sum/tb.length);


    }
}
