package ExoTableau;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*
Écrire un algorithme qui saisit 6 entiers et les stocke dans un
tableau, puis affiche le contenu de ce tableau une fois qu’il est
rempli.
• BONUS : initialiser un tableau de 10 entiers avec les valeurs 2,
4, 8, 16, 32, 64, 128, 256, 512, 1024 à l’aide d’une boucle.
Ensuite, à l’aide d’une boucle afficher la valeur de chaque
cellule du tableau avec l’opération Ecrire().
 */
public class Exo1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        final int TB_LENGTH = 6;
        var tb = new int[TB_LENGTH];

        for (int i =0; i < TB_LENGTH;i++) {
            System.out.println("Entrez un nombre : ");
            tb[i] = sc.nextInt();
        }

        for (int i = 0; i < TB_LENGTH;i++) {
            System.out.print(tb[i]);
        }

//        System.out.println(Arrays.toString(tb));

//        System.out.print("[");
//        for (int i = 0; i < TB_LENGTH;i++) {
//            System.out.print(tb[i]);
//            if (i != TB_LENGTH-1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.print("]");

    }
}
