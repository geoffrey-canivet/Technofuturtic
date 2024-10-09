package ForTableau;
/*
À l’aide des boucles, réalisez un algorithme permettant de trier un tableau d’entier
dans l’ordre croissant. Mettez-le ensuite en pratique avec le Flowgorithm.
*/
public class Exo3 {
    public static void main(String[] args) {
        int[] tb = {1, 3, 2, 5, 4, 2};

        for (int i = 0; i < tb.length - 1; i++) {
            for (int j = 0; j < tb.length - 1 - i; j++) {
                if (tb[j] > tb[j + 1]) {
                    int temp = tb[j];
                    tb[j] = tb[j + 1];
                    tb[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < tb.length; i++) {
            System.out.print(tb[i] + " ");
        }
    }
}
