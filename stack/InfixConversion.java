package stack;
import java.util.Scanner;
import java.util.Stack;


public class InfixConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        sc.close();
        Stack<String> post=new Stack<>();
        Stack<String> pre=new Stack<>();
        Stack<Character> ops=new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch=exp.charAt(i);
            if(ch=='('){
                ops.push(ch);
            }
            else if((ch>='0' && ch<='9')||(ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
                post.push(ch+"");
                pre.push(ch+"");
            }
            else if(ch==')'){
                while(ops.peek()!='('){
                    char op=ops.pop();
                    String postv2=post.pop();
                    String postv1=post.pop();
                    String postv=postv1+postv2+op;
                    post.push(postv);
                    String prev2=pre.pop();
                    String prev1=pre.pop();
                    String prev=op+prev1+prev2;
                    pre.push(prev);
                }
                ops.pop();
            }
            else if(ch=='+' || ch=='-' ||ch=='*' ||ch=='/'  ){
                while(!ops.empty() && ops.peek()!='(' && precedence(ch)<=precedence(ops.peek())){
                    char op=ops.pop();
                    String postv2=post.pop();
                    String postv1=post.pop();
                    String postv=postv1+postv2+op;
                    post.push(postv);
                    String prev2=pre.pop();
                    String prev1=pre.pop();
                    String prev=op+prev1+prev2;
                    pre.push(prev);
                    
                }
                ops.push(ch);
            }
        }
        while(!ops.empty()){
            char op=ops.pop();
            String postv2=post.pop();
            String postv1=post.pop();
            String postv=postv1+postv2+op;
            post.push(postv);
            String prev2=pre.pop();
            String prev1=pre.pop();
            String prev=op+prev1+prev2;
            pre.push(prev);

        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Return 0 for any other characters
    }
    
}
