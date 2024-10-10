import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        checkParity(scanner);
//        evaluateResult(scanner);
        orderCoffee(scanner);
    }

    // Méthode pour vérifier si un nombre est pair ou impair
    public static void checkParity(Scanner scanner) {
        System.out.println("entrez un nombre:");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("paire");
        } else {
            System.out.println("impaire");
        }
    }

    // Méthode pour évaluer le résultat
    public static void evaluateResult(Scanner scanner) {
        System.out.println("entrez un resultat:");
        int result = scanner.nextInt();

        if (result <= 10) {
            System.out.println("ridicule");
        } else if (result <= 20) {
            System.out.println("nul");
        } else if (result <= 30) {
            System.out.println("non");
        } else if (result <= 40) {
            System.out.println("vraiment pas");
        } else if (result <= 50) {
            System.out.println("bof");
        } else if (result <= 60) {
            System.out.println("ca va");
        } else if (result <= 70) {
            System.out.println("ca passe");
        } else if (result <= 80) {
            System.out.println("pas mal");
        } else if (result <= 90) {
            System.out.println("tres bien");
        } else if (result <= 100) {
            System.out.println("PARFAIT");
        } else {
            System.out.println("resultat impossible");
        }
    }

    // Méthode pour commander un café
    public static void orderCoffee(Scanner scanner) {
        System.out.println("quel café voulez-vous?");
        System.out.println("-----------------------");
        System.out.println("1/ espresso");
        System.out.println("2/ latte");
        System.out.println("3/ cappuccino");
        System.out.println("-----------------------");
        System.out.println("Votre choix:");
        int cafeType = scanner.nextInt();
        System.out.println("Quelle taille pour le café?");
        System.out.println("-----------------------");
        System.out.println("1/ Petit");
        System.out.println("2/ Moyen");
        System.out.println("3/ Grand");
        System.out.println("-----------------------");
        System.out.println("Votre choix:");
        int cafeTaille = scanner.nextInt();
        System.out.println("vous en desirez combien?");
        System.out.println("Votre choix:");
        int cafeNb = scanner.nextInt();

        String name = "";
        String taille = "";
        int prixType = 0;
        int prixTaille = 0;

        switch (cafeType) {
            case 1:
                name = "espresso";
                prixType = 2;
                break;
            case 2:
                name = "latte";
                prixType = 3;
                break;
            case 3:
                name = "cappuccino";
                prixType = 4;
                break;
        }

        switch (cafeTaille) {
            case 1:
                taille = "petit";
                prixTaille = 2;
                break;
            case 2:
                taille = "moyen";
                prixTaille = 4;
                break;
            case 3:
                taille = "grand";
                prixTaille = 6;
                break;
        }

        double prixTotal = (prixType + prixTaille) * cafeNb;
        double originalPrixTotal = prixTotal;

        System.out.println("Le prix total pour " + cafeNb + " " + name + "(s) de taille " + taille + " est: " + prixTotal + " euros.");

        if (originalPrixTotal <= 19) {
            System.out.println("Aucune réduction appliquable");
        } else if (originalPrixTotal <= 50) {
            System.out.println("Vous avez droit à une réduction de 5%");
            prixTotal -= originalPrixTotal * (5.0 / 100);
            System.out.println("Nouveau prix: " + prixTotal);
        } else if (originalPrixTotal <= 100) {
            System.out.println("Vous avez droit à une réduction de 10%");
            prixTotal -= originalPrixTotal * (10.0 / 100);
            System.out.println("Nouveau prix: " + prixTotal);
        } else {
            System.out.println("Vous avez droit à une réduction de 1.5%");
            prixTotal -= originalPrixTotal * (1.5 / 100);
            System.out.println("Nouveau prix: " + prixTotal);
        }

    }
}
