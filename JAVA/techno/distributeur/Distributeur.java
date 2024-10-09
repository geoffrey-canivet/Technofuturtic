package distributeur;

import java.util.Scanner;

public class Distributeur {

    public static void main(String[] args) {
        // Déclaration du stock de boissons
        int stockCoca = 5;
        int stockPepsi = 3;
        int stockFanta = 2;
        int stockEau = 4;

        // Créer un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Variable pour savoir si l'utilisateur veut une autre boisson
        boolean autreBoisson;

        // Boucle pour proposer des boissons tant que l'utilisateur le souhaite
        do {
            // Menu du distributeur
            System.out.println("Bienvenue dans le distributeur de boissons !");
            System.out.println("Voici les boissons disponibles : ");
            System.out.println("1. Coca (Stock : " + stockCoca + ")");
            System.out.println("2. Pepsi (Stock : " + stockPepsi + ")");
            System.out.println("3. Fanta (Stock : " + stockFanta + ")");
            System.out.println("4. Eau (Stock : " + stockEau + ")");

            // Demander à l'utilisateur de choisir une boisson
            System.out.print("Entrez le numéro de la boisson que vous souhaitez : ");
            int choix = scanner.nextInt();

            // Vérifier le choix de l'utilisateur et le stock
            switch (choix) {
                case 1: // Coca
                    if (stockCoca > 0) {
                        stockCoca--;
                        System.out.println("Vous avez choisi un Coca. Il reste " + stockCoca + " Coca(s) en stock.");
                    } else {
                        System.out.println("Désolé, il n'y a plus de Coca en stock.");
                    }
                    break;

                case 2: // Pepsi
                    if (stockPepsi > 0) {
                        stockPepsi--;
                        System.out.println("Vous avez choisi un Pepsi. Il reste " + stockPepsi + " Pepsi(s) en stock.");
                    } else {
                        System.out.println("Désolé, il n'y a plus de Pepsi en stock.");
                    }
                    break;

                case 3: // Fanta
                    if (stockFanta > 0) {
                        stockFanta--;
                        System.out.println("Vous avez choisi un Fanta. Il reste " + stockFanta + " Fanta(s) en stock.");
                    } else {
                        System.out.println("Désolé, il n'y a plus de Fanta en stock.");
                    }
                    break;

                case 4: // Eau
                    if (stockEau > 0) {
                        stockEau--;
                        System.out.println("Vous avez choisi une Eau. Il reste " + stockEau + " Eau(x) en stock.");
                    } else {
                        System.out.println("Désolé, il n'y a plus d'Eau en stock.");
                    }
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez entrer un numéro correspondant à une boisson.");
            }

            // Demander à l'utilisateur s'il veut une autre boisson
            System.out.print("Voulez-vous une autre boisson ? (oui = 1, non = 0) : ");
            int reponse = scanner.nextInt();

            // Vérifier la réponse de l'utilisateur
            autreBoisson = (reponse == 1);

        } while (autreBoisson); // Tant que l'utilisateur veut une autre boisson

        // Fermer le scanner
        System.out.println("Merci d'avoir utilisé le distributeur de boissons !");
        scanner.close();
    }
}
