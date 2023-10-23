import java.util.Scanner;
public class pythagoreantriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int l=Math.max(n1,(Math.max(n2,n3)));
        // System.out.println(l);
        if(l==n1){
            boolean flag=((n2*n2) + (n3*n3))==(n1*n1);
            System.out.println(flag);
        }
        else if(l==n2){
            boolean flag=((n1*n1) + (n3*n3))==(n2*n2);
            System.out.println(flag);
        }
        else{
            boolean flag=((n2*n2) + (n1*n1))==(n3*n3);
            System.out.println(flag);
        }
    }
}
