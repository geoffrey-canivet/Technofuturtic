package ForTableau;

import java.util.Arrays;
import java.util.Scanner;

/*
En considérant un tableau d'entiers trié dans l'ordre croissant, réaliser un
algorithme étant capable d'insérer une nouvelle valeur dans le tableau de façon à
ce que la tableau reste trié. Le but n'est évidemment pas d'insérer la valeur à la fin
et de trier après mais bien de l'insérer au bon endroit directement.
*/
public class Exo7 {
    public static void main(String[] args) {
        int[] tb = {1, 3, 5, 7, 9};
        int size = tb.length;

        System.out.println("Tableau initial: " + Arrays.toString(tb));

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une valeur à insérer : ");
        int val = sc.nextInt();

        int pos = 0;
        while (pos < size && tb[pos] < val) {
            pos++;
        }

        int[] nwTb = new int[size + 1];

        for (int i = 0; i < pos; i++) {
            nwTb[i] = tb[i];
        }

        nwTb[pos] = val;

        for (int i = pos; i < size; i++) {
            nwTb[i + 1] = tb[i];
        }

        System.out.println("Tableau après insertion: " + Arrays.toString(nwTb));

        sc.close();
    }
}