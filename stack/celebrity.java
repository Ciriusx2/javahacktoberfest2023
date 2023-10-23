package stack;
import java.util.Stack;
import java.util.Scanner;
public class celebrity {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for(int i=0;i<a.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(a[i][j]==1){
                // if i knows j, i is not a celebrity
                st.push(j);
            }
            else{
                // if i doesnt know j, j is not a celebrity
                st.push(i);
            }
        }
        int pot=st.pop();
        for(int i=0;i<a.length;i++){
            if(i!=pot){
                if(a[i][pot]==0 || a[pot][i]==1){
                    System.out.println("No celebrity"); 
                    return;
                }
            }
        }
        System.out.println(pot);
    }
}
