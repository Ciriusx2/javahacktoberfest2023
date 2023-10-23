package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("helli");
        sb.setCharAt(0, 'd');
        sb.insert(2,'d');
        System.out.println(sb);
    }
}
