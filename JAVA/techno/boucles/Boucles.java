import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Boucles {
    public static void main(String[] args) {
//        exo1();
//        exo2();
//        exo3();
//        exo4();
    }

    public static void exo1(){
        boucleWhile();
        boucleDoWhile();
        boucleFor();
    }

    public static void boucleWhile() {
        System.out.println("Boucle While");
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }

    public static void boucleDoWhile() {
        System.out.println("Boucle Do While");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 3);
    }

    public static void boucleFor() {
        System.out.println("Boucle For");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    public static void exo2(){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);

        System.out.println(randomNumber);

        int tentative = 5;

        do {
            System.out.println("Il vous reste " + (tentative) + " tentatives. Entrez un chiffre entre 1 et 10");
            System.out.println("Votre choix: ");

            if (scanner.nextInt() == randomNumber) {
                System.out.println("C'est gagné !");
                break;
            }
            tentative--;
        } while (tentative > 0);
    }

    public static void exo3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("choisissez la taille de la suite:");
        int size = scanner.nextInt();
        int[] fibonacci = new int[size];


        if (size >= 1) {
            fibonacci[0] = 0;
        }
        if (size >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < size; i++) {
            int termeP = fibonacci[i-1]; // terme précédent.
            int termeP2 = fibonacci[i-2];
            fibonacci[i] = termeP + termeP2;
        }
        System.out.println("Suite de fibonacci -> " + Arrays.toString(fibonacci));

       // factorialisation
        int n = fibonacci[size - 1];
        int factorielle = 1;
        System.out.println("Nombre a factorialiser -> " + n);

        // creer tableau de factorielles
        int[] tabFact = new int [n];
        int item = n;
        for (int i = 0; i < n; i++) {
            tabFact[i] = item;
            item = item - 1;
        }
        System.out.println("Facteurs -> " + Arrays.toString(tabFact));

        //multiplier element tableau
        for (int i = 0; i < tabFact.length; i++) {
            factorielle *= tabFact[i];
        }

        System.out.println("factorielle -> " + factorielle);




    }

    public static void exo4(){
        String palindrome = "A l'aide de son radar, Anna a repéré un kayak.";
        int isPalindromle = 0;

        palindrome = palindrome.replace("'", " ");
        palindrome = palindrome.replace(",", "");
        palindrome = palindrome.replace(".", "");
        palindrome = palindrome.replace(" ", ",");
        palindrome = palindrome.toLowerCase();

        String[] tabMots = palindrome.split(",");

        System.out.println(Arrays.toString(tabMots));

        int size = tabMots.length;

        int index = 0;


        for (int i = 0; i < size; i++) {
            // Transformer le mot en tableau
            String[] verifTab1 = tabMots[i].split("");
            String[] verifTab2 = new String[verifTab1.length];
            // inverser le tableau
            for (int j = 0; j < verifTab1.length; j++) {
                verifTab2[j] = verifTab1[verifTab1.length - 1 - j]; // Inverser les index
            }

            String verif1 = String.join("", verifTab1);
            String verif2 = String.join("", verifTab2);

            // comparer les mots et compte le nb de palindrome
            if (verif1.length() >= 3 && verif2.length() >= 3) { // debug si mot de moins de 3 lettres
                if (verif1.equals(verif2)) {
                    isPalindromle = isPalindromle + 1;

                }
            }
        }

        // ajouter palindrome a la table
        String[] tabPalindrome = new String[isPalindromle];



        for (int i = 0; i < size; i++) {
            // Transformer le mot en tableau
            String[] verifTab1 = tabMots[i].split("");
            String[] verifTab2 = new String[verifTab1.length];
            // inverser le tableau
            for (int j = 0; j < verifTab1.length; j++) {
                verifTab2[j] = verifTab1[verifTab1.length - 1 - j]; // Inverser les index
            }

            String verif1 = String.join("", verifTab1);
            String verif2 = String.join("", verifTab2);

            // comparer les mots et compte le nb de palindrome
            if (verif1.length() >= 3 && verif2.length() >= 3) { // debug si mot de moins de 3 lettres
                if (verif1.equals(verif2)) {
                    tabPalindrome[index] = verif1;
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(tabPalindrome));

        // trouver le plus long mot
        String result = "";
        for (int i = 0; i < tabPalindrome.length; i++) {
            if (tabPalindrome[i].length() > result.length()) {
                result = tabPalindrome[i];
            }
        }
        // si egalité prend le 1e
        System.out.println(result);
    }
}
