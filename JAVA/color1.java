class ResistorColor {
    int colorCode(String color) {
        switch (color) {
            case "black":
                return 0;
            case "brown":
                return 1;
            case "red":
                return 2;
            case "orange":
                return 3;
            case "yellow":
                return 4;
            case "green":
                return 5;
            case "blue":
                return 6;
            case "violet":
                return 7;
            case "grey":
                return 8;
            case "white":
                return 9;
            default:
                return -1; // Retourne -1 si la couleur n'est pas reconnue
        }
    }
    
    // String[] colors() {
        
    // }




    public static void main(String[] args) {
        ResistorColor newColor = new ResistorColor();
        int code = newColor.colorCode("black"); // Exemple d'appel
        System.out.println("Le code de couleur pour 'black' est : " + code); // Affiche le code de couleur
    }





}


