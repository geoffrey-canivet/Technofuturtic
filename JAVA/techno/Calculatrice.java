import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        //À l’aide d’une boucle Faire… TantQue, améliorez l’algorithme de la calculatrice afin
        //qu’elle demande à l’utilisateur s’il veut faire un autre calcul (tant qu’il le désire).
        var sc = new Scanner(System.in);

        boolean run = true;

        do {
            System.out.println("Entrez un nombre : ");
            double nb1 = sc.nextDouble();
            System.out.println("Entrez un opérateur (+, -, *, /) : ");
            String operateur = sc.next();
            System.out.println("Entrez un 2ème nombre : ");
            double nb2 = sc.nextDouble();
            System.out.println(operateur);
            switch (operateur) {
                case "+" -> System.out.println(nb1 + nb2);
                case "-" -> System.out.println(nb1 - nb2);
                case "/" -> System.out.println(nb1 / nb2);
                case "*" -> System.out.println(nb1 * nb2);
                default -> System.out.println("L'opérateur rentré n'est pas pris en charge.");
            }

            System.out.println("Souhaitez réeffectuer une opération : ");
            String continue_ = sc.next();
            System.out.println(continue_);
//            if (continue_ == "oui") {
//                run = true;
//            } else {
//                run = false;
//            }
//            if (continue_ == "oui") run = true;
//            else run = false;

            run = continue_.equals("oui") ? true : false;
        } while (run);


    }

}
