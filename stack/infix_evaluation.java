package stack;

import java.util.Scanner;
import java.util.Stack;

public class infix_evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        sc.close();
        Stack<Integer> operands = new Stack<>(); // Renamed 'opnds' to 'operands' for clarity
        Stack<Character> operators = new Stack<>(); // Renamed 'optors' to 'operators' for clarity
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int result = performOperation(v1, v2, operator);
                    operands.push(result);
                }
                operators.pop(); // Pop the opening parenthesis
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int result = performOperation(v1, v2, operator);
                    operands.push(result);
                }
                operators.push(ch);
            }
        }
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int result = performOperation(v1, v2, operator);
            operands.push(result);
        }
        System.out.println(operands.peek());
    }

    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0; // Return 0 for any other characters
    }

    public static int performOperation(int v1, int v2, char operator) {
        if (operator == '+') {
            return v1 + v2;
        } else if (operator == '-') {
            return v1 - v2;
        } else if (operator == '*') {
            return v1 * v2;
        } else if (operator == '/') {
            return v1 / v2;
        }
        return 0; // Handle unsupported operators, you can throw an exception here if needed
    }
}
