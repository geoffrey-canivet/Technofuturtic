public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x) {
        return 40 - x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x) {
        return x * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y) {
        return x * 2 + y;
    }
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println("Temps de cuisson prévu : " + lasagna.expectedMinutesInOven() + " minutes.");
        System.out.println("Temps de cuisson restant : " + lasagna.remainingMinutesInOven(30) + " minutes.");
        System.out.println("Temps de préparation : " + lasagna.preparationTimeInMinutes(2) + " minutes.");
        System.out.println("Temps de préparation : " + lasagna.totalTimeInMinutes(3, 20) + " minutes.");
    }
}