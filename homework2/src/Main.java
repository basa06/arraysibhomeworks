public class Main {
    public static void main(String[] args) {
        int[]nums ={3,5,0,11,1};
        int count = 0;
        int s = 0;
        for (int i = 0; i<=4; i++){
            if(nums[i]!=0){
                s=s+nums[i];
                count++;
            }
        }
        if (count == 0){
            System.out.println(0);

        }
        else{
            System.out.println(s/count);
        }
    }
}