import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String encore = "o";

        while (Objects.equals(encore, "o")) {

            int[] tab = {75, 5, 19, 87, 33, 12, 8, 55, 75, 19, 16, 33, 12, 33};
            int trouve = 0;

            System.out.println(Arrays.toString(tab));
            System.out.println("Entrez un chiffre : ");

            int user = sc.nextInt();

            for (int i = 0; i < tab.length; i++) {
                if (tab[i] == user) {
                    trouve++;
                }
            }
            System.out.println("Votre chiffre est présent " + trouve + "x dans le tableau originale");

            int[] newTab = new int[(tab.length - trouve)];
            int tmp = 0;

            for (int j : tab) {
                if (j != user) {
                    newTab[tmp] = j;
                    tmp++;
                }
            }

            System.out.println("Nouveau tableau : " + Arrays.toString(newTab));

            System.out.println("Voulez-vous rejouer ? o/n");
            encore = sc.next();
        }
        System.out.println("Bye bye !");

    }
}
