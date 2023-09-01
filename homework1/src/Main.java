public class Main {
    public static void main(String[] args) {
        int[]arr= {2,5,-3,11,193,-2};
        int sum = 0;
        for (int x : arr){
            System.out.println(x);
            sum=sum+x;

        }
        System.out.println("sum="+sum);
    }
}