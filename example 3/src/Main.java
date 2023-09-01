public class Main {
    public static void main(String[] args) {
        int [] sequence = {5, 10, 15, 20};
        int difference = 0;
        boolean is_arithmetic= true;
        for (int n = 0; n < sequence.length-1 && is_arithmetic; n = n+1){
            difference = sequence[1]-sequence[0];
            if (sequence[n+1]-sequence[n]!=difference)
                is_arithmetic=false;
        }
        System.out.println(is_arithmetic);
    }
}