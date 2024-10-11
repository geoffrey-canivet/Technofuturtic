//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class OperateurVariable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 39;
        double taille = 1.80;
        final String nom = "Geoffrey";
        System.out.println(nom + " à " + age + " ans et mesure " + taille * 100 +" cm.");

        System.out.println("Entrez un entier : ");
        String stringEntier = scanner.nextLine();

        System.out.println("Entrez un reel : ");
        String stringReel = scanner.nextLine();

        // Conversion
        int entier = Integer.parseInt(stringEntier);
        // Conversion
        double reel = Double.parseDouble(stringReel);

        System.out.println("string -> " + stringEntier);
        System.out.println("int -> " + entier);
        System.out.println("string -> " + stringReel);
        System.out.println("double -> " + reel);

        System.out.println("double de l'entier -> " + entier * 2);
        System.out.println("double du double -> " + reel * 2);
        
        System.out.println("Entrez un num 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Entrez un num 2 : ");
        int num2 = scanner.nextInt();
        
        System.out.println("somme de " + num1 + " et " + num2 + " ->" + num1+num2);
    }
    
}