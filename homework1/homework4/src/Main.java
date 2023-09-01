public class Main {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]rev_arr=new int[arr.length];
        for (int i = 0; i<= arr.length-1; i++){
            rev_arr[i]=arr[arr.length-1-i];
        }
        for (int x :rev_arr){
            System.out.print(x+" ");
        }

    }
}