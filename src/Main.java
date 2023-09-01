public class Main {
    public static void main(String[] args) {
        int vals[] = {5,6,2-4};
        int length = vals.length-1;
        int difference[]=new int [vals.length-1];
        for (int n = 0; n <= vals.length-2; n = n+1){
            difference[n] = vals[n+1]-vals[n];

        }
        for (int o : difference)
            System.out.println(o +"  ");

        }


    }
