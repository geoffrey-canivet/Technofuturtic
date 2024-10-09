package fonction;

public class FunTab {
    public static void main(String[] args) {
        int table[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int nbIndex = table.length;
        int number = 4;

        int result = findTab(table, nbIndex, number);

        if (result != -1 ) {
            System.out.println("trouvé a l'index " + result);
            
        } else {
            System.out.println("pas trouvé");
        }


    }
    static int findTab(int[] tab, int size, int num) {

        for (int i = 0; i < size; i++) {
            if (tab[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
