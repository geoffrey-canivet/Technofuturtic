package tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Tableaux {
    
    public static void main(String[] args) {
//        exo1();
        exo2();
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

    static void exo2() {

        int userNb = 4;
        int size = 2 * userNb + 1;

        int[][] tableauMulti = new int[size][size];

        // remplire le tableau
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                tableauMulti[i][j] = 1;

            }
        }

        // affiche le tableau
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(tableauMulti[i][j]);
            }
            System.out.println();
        }

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
