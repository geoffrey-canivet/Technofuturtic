import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        int choice1;
        int choice2;
        String operator;
        int result;
        String continued;

        var sc = new Scanner(System.in);


        while (true) {


            System.out.print("Ecrire le premier nombre: ");
            choice1 = sc.nextInt();
            System.out.println(choice1);
            System.out.print("choisis un opérateur (+,-,*,/)");
            operator = sc.next();
            System.out.print("Ecrire le deuxiemme nombre: ");
            choice2 = sc.nextInt();
            System.out.println(choice2);


            switch (operator) {
                case "+":
                    result = choice1 + choice2;
                    System.out.println("addition = " + result);
                    break;
                case "-":
                    result = choice1 - choice2;
                    System.out.println("soustraction = " + result);
                    break;
                case "/":
                    result = choice1 / choice2;
                    System.out.println("division = " + result);
                    break;
                case "*":
                    result = choice1 * choice2;
                    System.out.println("multiplacation = " + result);
                    break;
            }
        }
    }
}
