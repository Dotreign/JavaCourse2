import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        if(line % 10 == 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
