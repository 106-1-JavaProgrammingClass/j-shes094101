import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        // write your code here
        Scanner src=new Scanner(System.in);
        double x=src.nextDouble();
        int y=src.nextInt();
        System.out.println(Math.round(x*(Math.pow(10,y)))/(Math.pow(10,y)));
    }

}
