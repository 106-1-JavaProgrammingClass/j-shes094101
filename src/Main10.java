import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        // write your code here
        Scanner src=new Scanner(System.in);
        String str =src.nextLine();
        char Old=src.next().charAt(0);
        char New=src.next().charAt(0);
        System.out.println(str.replace(Old,New));
    }

}