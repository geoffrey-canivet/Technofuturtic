package ForTableau;

import java.util.Scanner;

/*
• Réalisez un algorithme dans lequel nous devons rechercher une valeur (entrée par
l'utilisateur) dans un tableau d'entiers. Si on trouve cette valeur, nous devons la
supprimer du tableau.
 */
public class Exo8 {
    public static void main(String[] args) {
        final int SIZE = 4;
        int[] tb = new int[SIZE];
        tb[0] = 1;
        tb[1] = 1;
        tb[2] = 2;
        tb[3] = 3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quelle valeur cherchez-vous dans le tableau : ");
        int search = sc.nextInt();

        int nbValToDelete = 0;
        for (int i = 0; i < tb.length; i++) {
            if (tb[i] == search) {
                nbValToDelete++;
            }
        }

        if (nbValToDelete == 0) {
            System.out.println("Valeur non trouvée dans le tableau.");
        }
        else {
            int[] newTb = new int[SIZE - nbValToDelete];
            int j = 0;

            for (int i = 0; i < tb.length; i++) {
                if (tb[i] != search) {
                    newTb[j++] = tb[i];
                }
            }
            System.out.println("tableau avant suppression : ");
            for (int i : tb) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("tableau après suppression : ");
            for (int val : newTb) {
                System.out.print(val + " ");
            }
        }

        sc.close();
    }
}
