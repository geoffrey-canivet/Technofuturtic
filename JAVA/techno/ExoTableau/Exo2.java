package ExoTableau;

public class Exo2 {
    /*
    • BONUS : initialiser un tableau de 10 entiers avec les valeurs 2,
    4, 8, 16, 32, 64, 128, 256, 512, 1024 à l’aide d’une boucle.
    Ensuite, à l’aide d’une boucle afficher la valeur de chaque
    cellule du tableau avec l’opération Ecrire().
    */
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] tb = new int[10];
        int value = 2;

        for (int i = 0; i < 10; i++) {
            tb[i] = value;
            value *= 2; // value = value *2
        }

        for (int i = 0; i < tb.length; i++) {
            System.out.println(tb[i]);
        }

    }
}
