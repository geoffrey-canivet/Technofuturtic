class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String numString = Integer.toString(numberToCheck);
        int nbIndex = numString.length();

        String[] tabString = new String[nbIndex];
        int[] tabInt = new int[nbIndex];
        int[] tabExpo = new int[nbIndex];

        int result = 0;
        
        // trasformer lettres en string et ajouter chaque lettres au tableau
        for (int i = 0; i < nbIndex; i++) {
            tabString[i] = Character.toString(numString.charAt(i)); 
        }
        // transformer lettres en int et ajouter au tableau
        for (int i = 0; i < nbIndex; i++ ){ 
            tabInt[i] = Integer.parseInt(tabString[i]);
            
        }
        // calcule l'exposant et l'ajoute au tableau
        for (int i = 0; i < nbIndex; i++ ){ 
            tabExpo[i] = (int) Math.pow(tabInt[i],nbIndex);
        }
        // calculer la somme du tableau
        for (int i = 0; i < nbIndex; i++) {
            result += tabExpo[i];  
        }

        if ( result == numberToCheck) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        ArmstrongNumbers armstrong = new ArmstrongNumbers();
        armstrong.isArmstrongNumber(153); // Exemple d'appel
    }

}

