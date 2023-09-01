public class Main {
    public static void main(String[] args) {
        //finds if the numbers are in ascending order
        int[]vals={-3,2,5,4,7};
        boolean result = true;
        int n = 1;
        while (result==true && n<5){
            if (vals[n]<vals[n-1]){
                result=false;
            }
            else{
                n++;
            }
        }
        System.out.println(result);
    }
}