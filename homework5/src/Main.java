public class Main {
    public static void main(String[] args) {
        int []original_arr={-3,2,6, -11};
        int[]culm_sum=new int[original_arr.length];
        int x=0;
        for(int i = 0; i<original_arr.length; i++){
            while (x<=i){
                for(int y: original_arr){
                    culm_sum[i]+=y;
                    System.out.println(culm_sum[i]);
                    x++;
                }
            }

        }
    }

    }
