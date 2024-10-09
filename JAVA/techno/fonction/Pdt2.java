package fonction;
import java.util.Arrays;
public class Pdt2 {
    public static void main(String[] args) {
        int seau[] = new int[17];
        int marmite[] = new int[50];

        process(seau, marmite);
    }
    static void process(int[] seau, int[] marmite) {
        System.out.println("seau = " + Arrays.toString(seau));
        System.out.println("marmite = " + Arrays.toString(marmite));

        for (int i = 0; i < marmite.length; i++) {
            if (seau > 0) {
                seau--;
                
            }
        }
    }
    
}
