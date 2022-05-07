import java.util.Scanner;

public class dort_bolum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        do{
            System.out.println("Sayı giriniz:");
            number = input.nextInt();
            if(number%4 == 0){
                total += number;
            }
        }while(number%2 == 0);

        System.out.println("Toplam:" +total);
    }
}
