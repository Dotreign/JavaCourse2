import java.util.Scanner;

public class task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number%i == 0){
                System.out.format("Число %d сложное", number);
                System.exit(0);
            }
        }
        System.out.format("Число %d простое", number);
    }
}
