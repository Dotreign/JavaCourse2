import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        if(line%10 == (line%100)/10){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
