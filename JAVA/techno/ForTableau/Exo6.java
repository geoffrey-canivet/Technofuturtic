package ForTableau;

import java.util.Arrays;
import java.util.Scanner;

/*
Réalisez un algorithme nous permettant de déplacer un pion dans un tableau de 10
éléments. Au début, le pion se trouve dans la première case du tableau. Nous
pouvons ensuite le déplacer par la gauche (g), par la droite (d) ou de stopper
l'algorithme (q).
*/
public class Exo6 {
    public static void main(String[] args) {
        final int SIZE = 10;
        String[] tb = new String[SIZE];
        int pos = 0;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        Arrays.fill(tb, "⬛");
        tb[pos] = "🐸";

        while (isRunning) {
            for (String c : tb) {
                System.out.print(c + " ");
            }

            System.out.print("Déplacez le pion (g = gauche, d = droite, q = quitter) : ");
            char choice = sc.next().charAt(0);
            tb[pos] = "⬛";

            switch (choice) {
                case 'g' -> pos = (pos - 1 + SIZE) % SIZE;
                case 'd' -> pos = (pos + 1) % SIZE;
                case 'q' -> isRunning = false;
                default -> System.out.println("Choix invalide. Essayez à nouveau.");
            }
            tb[pos] = "🐸";
        }

        sc.close();
    }
}