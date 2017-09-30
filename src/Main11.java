import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        // write your code here
        Scanner src=new Scanner(System.in);
        int x=src.nextInt();
        int y=src.nextInt();
        int z=src.nextInt();
        System.out.println(Math.max(Math.max(x,y),z));
        System.out.println(Math.min(Math.min(x,y),z));
    }

}
