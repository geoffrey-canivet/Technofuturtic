package fonction;

public class Pdt {
    public static void main(String[] args) {
        int seau = 17; 
        int marmite = 0; 
        process(seau,marmite);
    }

    static void process(int seau, int marmite) {
        for (int i = 0; i < 50; i++) {
            if (marmite < 50) {
                if (seau > 0) {
                    seau--;  
                    marmite++;  
                } else {
                    seau = 17;
                }
            }
        }
        System.out.println("Fin du processus. Il reste " + seau + " dans le seau.");
    }

}
