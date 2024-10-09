package boucles;

public class Boucles {
    public static void main(String[] args) {
        // Boucle pour afficher la table de multiplication par 2
        // int nombre = 2;
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(nombre + " x " + i + " = " + (nombre * i));
        // }

        // Boucle pour les tables de 1 à 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("Table de multiplication de " + i + " :");
            // Boucle pour multiplier les nombres de 1 à 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Saut de ligne pour espacer les tables
        }


    }
}