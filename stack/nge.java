package stack;
import java.util.Stack;
import java.util.Scanner;

public class nge {
    public static int[] solve(int []arr){
        int[ ] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        return nge;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int nge[]=solve(a);
        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i] +" ");
        }

    }
    
}
