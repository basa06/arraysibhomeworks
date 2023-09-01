public class Main {
    public static void main(String[] args) {
        int[] original_arr = {4, -3, -5, 9, 1, 11};
        int[] smaller = new int[original_arr.length];
        int[] larger = new int[original_arr.length];
        int m = 1;
        int i = 0;
        for (int x : original_arr) {

            if (x < m) {
                smaller[i] = x;


            } else if (x > m) {
                larger[i] = x;


            }
            i++;

        }
        System.out.println("smaller: ");
        for (int x : smaller) {
            if (x != 0) {
                System.out.println(x);
            }
        }
        System.out.println("larger: ");
        for (int x : larger) {
            if (x != 0) {
                System.out.println(x);
            }

        }
    }
}
