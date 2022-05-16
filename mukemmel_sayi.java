import java.util.Scanner;

public class mukemmel_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i=1, total=0;
        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();
        while(i<number){
            if(number%i == 0){
                total = total + i;
                i++;
            }else{
                i++;
            }
        }
        if(total == number){
            System.out.println(number+ "Mükemmel Sayıdır");
        }else{
            System.out.println(number+ "Mükemmel sayı değildir");
        }
    }
}
