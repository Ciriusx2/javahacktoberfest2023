import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            int c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }

    }
}
