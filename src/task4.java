import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%400 == 0 || year%4 == 0 && year%100 != 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
