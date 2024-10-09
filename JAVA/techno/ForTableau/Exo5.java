package ForTableau;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*
Réalisez un algorithme permettant de rechercher une valeur dans un tableau. Si la
valeur se trouve bien dans la tableau, nous affichons sa position.
*/
public class Exo5 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var tb = new int[]{1, 1, 2, 2, 2, 3, 3, 3, 3};

        System.out.println("Entrez le nombre cherché dans le tableau : ");
        int searchValue = sc.nextInt();
        int countValue = 0;

        for (int i : tb) {
            if (searchValue == i) {
                countValue++;
            }
        }

        var indexTb = new int[countValue];

        int count = 0;
        for (int i = 0; i < tb.length; i++) {
            if (searchValue == tb[i]) {
                indexTb[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(indexTb));
    }
}
