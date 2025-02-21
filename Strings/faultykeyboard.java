package Strings;

import java.util.Scanner;

public class faultykeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String typed = sc.next();
        sc.close();
        System.out.println(solution(name, typed));
    }

    static boolean solution(String name, String typed) {
        if (name.length() > typed.length())
            return false;
        int i = 0;
        int j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (i > 0 && name.charAt(i - 1) == typed.charAt(i)) {
                j++;

            } else {
                return false;
            }
        }
        while (j < typed.length()) {
            if (name.charAt(i - 1) != typed.charAt(j))
                return false;
            j++;
        }
        return i < name.length() ? false : true;

    }
}