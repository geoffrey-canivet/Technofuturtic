public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed <= 4) {
            return speed * 221;
        } else if (speed >= 5 && speed <= 8) {
            return speed * 221 * 0.9;
        }else if (speed == 9) {
            return speed * 221 * 0.8;
        } else {
            return speed * 221 * 0.77;
        }
        
    }

    public int workingItemsPerMinute(int speed) {
    if (speed <= 4) {
        return (int) (speed * 221 / 60);  // Cast en int pour assurer le retour d'un entier
    } else if (speed >= 5 && speed <= 8) {
        return (int) (speed * 221 * 0.9 / 60);  // Cast en int
    } else if (speed == 9) {
        return (int) (speed * 221 * 0.8 / 60);  // Cast en int
    } else {
        return (int) (speed * 221 * 0.77 / 60);  // Cast en int
    }
}

}
