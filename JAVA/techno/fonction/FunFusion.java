package fonction;
import java.util.Arrays;
public class FunFusion {
    public static void main(String[] args) {
        int table1[] = new int[]{1,2,3};
        int table2[] = new int[]{4,5,6};

        System.out.println(Arrays.toString(fusionTab(table1, table2)));
      
    }

    static int[] fusionTab(int[] tab1, int[] tab2) {
        int newTabLength = tab1.length + tab2.length;
        int tab3[] = new int[newTabLength];
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[i + tab1.length] = tab2[i];
        }
        return tab3;
    }


}
