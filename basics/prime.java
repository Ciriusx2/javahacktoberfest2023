import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int i=low;i<=high;i++){
            int count=0;
            for(int n=2;n*n<=i;n++){
                if(i%n==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
