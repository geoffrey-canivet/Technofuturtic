public class ElonsToyCar {
    int distance = 0;
    int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if (battery <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
        
    }

    public void drive() {
        if (battery > 0) {
            distance += 20; // Ajoute 20 mètres à la distance
            battery--; // Diminue la batterie de 1
        }
    }
}
