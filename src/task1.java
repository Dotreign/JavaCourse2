import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        if(line > 99 && line < 1000){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
