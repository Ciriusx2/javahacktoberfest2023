package stack;

import java.util.Scanner;
import java.util.Stack;

public class slidingwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        int nge[]=new int[a.length];
        nge[a.length-1]=a.length;
        for(int i=a.length-2;i>=0;i--){
            while(st.size()>0 && a[i]>=a[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=a.length;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }
        int j=0;
        for(int i=0;i<(n-k);i++){
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j=nge[j];
            }
            System.out.print(a[j]);
        }

    }
    
}
