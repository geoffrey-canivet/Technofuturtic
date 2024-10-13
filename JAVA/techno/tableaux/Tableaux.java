package tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Tableaux {
    
    public static void main(String[] args) {
//        exo1();
//        exo2();
//        exo3();
    };

    static void exo1(){
        int[] tableEntier = new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10, 11};

        System.out.println("Tableau initial : " + Arrays.toString(tableEntier));
        for (int i = 0; i < tableEntier.length; i++) {
            tableEntier[i] = i;
        }
        System.out.println("Tableau modifié : " + Arrays.toString(tableEntier));
    };

    static void exo2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();  // Le nombre que l'utilisateur entre

        // Taille du tableau : (2n + 1) x (2n + 1)
        int size = 2 * n + 1;

        int[][] tableau = new int[size][size];

        // Remplissage du tableau avec les valeurs appropriées
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Le nombre à afficher dépend de la distance à l'une des bordures
                int minHautGauche = Math.min(i, j);  // Distance minimum au bord supérieur ou gauche
                int minBasDroite = Math.min(size - i - 1, size - j - 1);  // Distance minimum au bord inférieur ou droit
                int value = Math.min(minHautGauche, minBasDroite);  // Distance minimale à un quelconque bord
                tableau[i][j] = n - value;
            }
        }

        // Affichage du tableau
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();  // Pour aller à la ligne après chaque rangée
        }

        scanner.close();  // Fermer le scanner
    }

    static void exo3(){
        String[] tabString = new String[100];

        for (int i = 0; i < tabString.length; i++) {
            if (i %5 == 0 && i %7 == 0) {
                tabString[i] = "Ding-Ding Bottle";
            } else if (i %5 == 0){
                tabString[i] = "Ding-Ding";
            } else if (i %7 == 0) {
                tabString[i] = "Bottle ";
            } else {
                tabString[i] = Integer.toString((i));
            }
        }
        System.out.println("Tableau modifié : " + Arrays.toString(tabString));
    }





}
