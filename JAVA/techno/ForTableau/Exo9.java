package ForTableau;

import java.util.Arrays;

/*
• En considérant deux tableaux d'entiers (non triés), réalisez un algorithme qui place
tous les éléments des deux tableaux dans un troisième. Ce dernier doit être trié
une fois l'algorithme terminé. Notez que le tri doit être fait en même temps que la
fusion des deux tableaux et pas après.
 */
public class Exo9 {
    public static void main(String[] args) {
        final int SIZE_TB1 = 4;
        final int SIZE_TB2 = 5;
        final int SIZE_TB3 = SIZE_TB1 + SIZE_TB2;

        int[] tb1 = new int[SIZE_TB1];
        int[] tb2 = new int[SIZE_TB2];
        int[] tb3 = new int[SIZE_TB3];

        for (int i = 0; i < tb1.length; i++) {
            tb1[i] = 2 * i;
        }

        int i = 0;
        tb2[i++] = 1;
        tb2[i++] = 0;
        tb2[i++] = 3;
        tb2[i++] = 9;
        tb2[i] = 10;

        System.out.println("Tableau 1 : " + Arrays.toString(tb1));
        System.out.println("Tableau 2 : " + Arrays.toString(tb2));

        boolean[] usedTb1 = new boolean[SIZE_TB1];
        boolean[] usedTb2 = new boolean[SIZE_TB2];

        for (int i3 = 0; i3 < SIZE_TB3; i3++) {
            int minVal = Integer.MAX_VALUE;
            int indexTb1 = -1, indexTb2 = -1;

            for (int j = 0; j < SIZE_TB1; j++) {
                if (!usedTb1[j] && tb1[j] < minVal) {
                    minVal = tb1[j];
                    indexTb1 = j;
                }
            }

            for (int j = 0; j < SIZE_TB2; j++) {
                if (!usedTb2[j] && tb2[j] < minVal) {
                    minVal = tb2[j];
                    indexTb1 = -1;
                    indexTb2 = j;
                }
            }

            tb3[i3] = minVal;

            if (indexTb1 != -1) {
                usedTb1[indexTb1] = true;
            }
            else if (indexTb2 != -1) {
                usedTb2[indexTb2] = true;
            }
        }

        System.out.println("Tableau 3 (trié) : " + Arrays.toString(tb3));
    }
}