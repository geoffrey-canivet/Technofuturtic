package ForTableau;

import java.util.Arrays;
import java.util.Scanner;

/*
•Inverser un tableau : soit un tableau T. Saisir ce tableau. Changer de place les
éléments de ce tableau de façon à ce que le nouveau tableau soit une sorte de
miroir de l'ancien et afficher le nouveau tableau. */
public class Exo2 {
    public static void main(String[] args) {
        var tb = new int[] {1,2,3,4,5,6};
        int temp;
        for (int i = 0; i < tb.length/2; i++) {
            temp = tb[i];
            tb[i] = tb[tb.length-1 - i];
            tb[tb.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(tb));
    }
}
