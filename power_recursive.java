import java.util.Scanner;

public class power_recursive {
    static int us_alma(int x, int y){
        if(y == 0){
            return 1;
        }else if(y == 1){
            return x;
        }
        return us_alma(x, y-1)*x;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz:");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz:");
        int us = input.nextInt();
        int result = us_alma(taban, us);
        System.out.print("Sonuç: "+result);



    }
}
