public class Main {
    public static void main(String[] args) {
        int[]original_arr={4,-3,-5,9,1,11};
        int[]smaller=[original_arr.length];
        int[]larger=[original_arr.length];
        int m=1;
        for (int x:original_arr){
            if (x<m){
                int i = 0;
                smaller[i]=x;
                i++;

            }
            else if (x>m){
                int i = 0;
                larger[i]=x;
                i++;
            }

        }
        System.out.println("smaller: ");
        for (int x : smaller){
            if (x!=0){
                System.out.println(x);
            }
        }
        System.out.println("larger: ");
        for (int x : larger){
            if (x!=0){
                System.out.println(x);
    }
}