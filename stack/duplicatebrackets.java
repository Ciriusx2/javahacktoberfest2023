package stack;
import java.util.Scanner;
import java.util.Stack;

public class duplicatebrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       Stack<Character> st1=new Stack<>(); 
       for (int i = 0; i <str.length() ; i++) {
        char ch=str.charAt(i);
        if(ch==')'){
            if(st1.peek()=='('){
                System.out.println(true);
                return;
            }
            else{
                while(st1.peek()!='('){
                    st1.pop();
                }
                st1.pop();
            }
        }
        else{
            st1.push(ch);
        }
       }
       System.out.println(false);
    }
    
}
