import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cats = in.nextInt();
        String cat1 = "кот";
        String cat2 = "кота";
        String cat3 = "котов";
        String catline = Integer.toString(cats);
        if(cats % 10 == 1 && cats != 11){
            catline += ' ' + cat1;
        } else if(cats%10 > 1 && cats%10 < 5 && (cats > 20 || cats < 10)){
            catline += ' ' + cat2;
        } else if(cats%10 > 4 || cats < 21 && cats > 9){
            catline += ' ' + cat3;
        }
        System.out.println(catline);
    }
}
