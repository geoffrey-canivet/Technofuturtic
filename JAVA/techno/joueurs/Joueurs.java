/*
• Écrire un algorithme demandant à l’utilisateur le nombre de joueurs (max 10
joueurs). Ensuite, l’algorithme doit demander à l’utilisateur le score de chaque
joueur. Une fois ceci fini, il faut afficher la moyenne des scores.
Testez-l’algorithme avec Flowgorithm
*/

package joueurs;

import java.util.Scanner;
import java.util.Arrays;

public class Joueurs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de joueurs : ");
        int nbJoueurs = scanner.nextInt();
        if (nbJoueurs <= 10) {
            System.out.println(nbJoueurs);
            int tb[] = new int[nbJoueurs];
            for (int i = 0; i < nbJoueurs; i++){
                System.out.println(i);
                System.out.println("point : ");
                tb[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(tb));



            

        } else {
            System.out.println("doit etre moins que 10");
        }
        


        scanner.close();
    }
    
    


}
