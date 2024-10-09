package ForTableau;

import java.util.Scanner;

/*
Réalisez un algorithme qui demande à l’utilisateur de taper 10 entiers et qui affiche
le plus petit et le plus grand de ces entiers. Attention, l’algorithme ne doit pas
retenir le minimum et le maximum lors de la saisie.
*/
public class Exo4 {
    public static void main(String[] args) {
        var tb = new int[10];
        int min;
        int max;

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entrez un nombre : ");
            tb[i] = sc.nextInt();
        }

        min = tb[0];
        max = tb[0];
        for (int i = 1; i < tb.length;i++) {
            if (tb[i]<min) {
                min = tb[i];
            }
            if (tb[i]>max) {
                max = tb[i];
            }
        }
        System.out.println("min : " + min + " max : " + max );

    }
}
