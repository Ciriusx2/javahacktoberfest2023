package stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        Stack<Character> st1=new Stack<>(); 
        st.push(12);
        st.push(12);
        st.push(12);
        st.push(12);
        st.push(12);
        System.out.print(st);
        System.out.print(st.peek()+" "+st.size());
    }
    
}
