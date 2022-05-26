import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(100);
        int right = 5;
        int number = 0;
        int i;
        for (i = right; i>0; i--){
            System.out.println("Tahmininizi giriniz: ");
            number = input.nextInt();
            if (number == a){
                System.out.print("Tebrikler doğru tahmin ettiniz.");
                break;
            }else{
                System.out.println("Hatalı sayı girdiniz.");
                System.out.printf("Kalan hakkınız: %d" , i-1);
                System.out.println();
                continue;

            }
        }
        if(i == 0){
            System.out.print("Kaybettiniz! Doğru sayı: " +a);
        }
    }
}
