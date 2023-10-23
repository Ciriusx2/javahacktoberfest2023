package Strings;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s1 = sc.nextLine();
        // // String s2 = sc.next();
        // System.out.println(s1);
        // System.out.println(s1.length());
        // for (int i = 0; i < s1.length(); i++) {
        // char ch = s1.charAt(i);
        // System.out.println(ch);

        // }
        String s = "abcd efg hij klm";
        // for(int i=0;i<s.length();i++){
        // for(int j=i+1;j<=s.length();j++){
        // System.out.println(s.substring(i, j));

        // }
        // }
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

}
