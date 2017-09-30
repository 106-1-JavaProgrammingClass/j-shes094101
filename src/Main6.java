import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        // write your code here
        Scanner src=new Scanner(System.in);
        String str =src.next();
        char y=src.next().charAt(0);
        System.out.println(str.replace(y,'\n'));
    }

}