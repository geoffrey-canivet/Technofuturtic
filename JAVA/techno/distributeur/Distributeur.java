// Réaliser l’algorithme d’un distributeur de boissons. Ce dernier propose plusieurs
// boissons et l’utilisateur choisit celle qu’il désire en entrant le numéro correspondant. Ne
// pas oublier de vérifier s’il y a encore des boissons en stock.

// Le distributeur de boissons pourrait proposer une autre boisson au client tant que ce
// dernier le désire


package distributeur;

import java.util.Scanner;

public class Distributeur {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tabBoisson[] = new String[]{"Coca", "Fanta", "Sprite", "Eau"};
        int stock[] = new int[]{3,8,3,6};
        boolean isOk = true;

        do {
            // text bienvenue + liste boissons
            System.out.println("Quelle boisson désirez-vous?");
            System.out.println(); 
            System.out.println("1/ " +  tabBoisson[0] + "Stock -> " + stock[0]);
            System.out.println("2/ " +  tabBoisson[1] + "Stock -> " + stock[1]);
            System.out.println("3/ " +  tabBoisson[2] + "Stock -> " + stock[2]);
            System.out.println("4/ " +  tabBoisson[3] + "Stock -> " + stock[3]);
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    isOk = process(0, stock, sc, isOk);
                    break;
                case 2:
                    isOk = process(1, stock, sc, isOk);
                    break;
                case 3:
                    isOk = process(2, stock, sc, isOk);
                    break;
                case 4:
                    isOk = process(3, stock, sc, isOk);
                    break;
                default:
                    break;
            }
        } while (isOk);
        System.out.println("Merci pour votre visite, à bientot !");
    }

    static Boolean process(int BoissonStock, int[] stock, Scanner sc, boolean isOk){
        if (stock[BoissonStock] <= 0) {
            System.out.println("Désolé le stock est vide.");
            System.out.println("Voulez-vous une autre boisson? 1 / 0");
            if (sc.nextInt() == 0) {
                isOk = false;
            }
        } else {
            stock[BoissonStock]--;
            System.out.println("Vous avez choisis " + tabBoisson[BoissonStock]);
            System.out.println("Vous pouvez récupérer votre boisson");
            System.out.println("Voulez-vous une autre boisson? 1 / 0");
            if (sc.nextInt() == 0) {
                isOk = false;
            }   
        }
        return isOk;
    }

}
