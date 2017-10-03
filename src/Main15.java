import java.util.Scanner;
public class Main15 {
    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        char v1 = src.next().charAt(0);
        int v2 = (int) v1;
        System.out.println(Integer.toHexString(v2));
        String str=src.next();
        int v3 = Integer.valueOf(str,16);
        System.out.println((char)v3);
    }}