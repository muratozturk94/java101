import java.util.Scanner;

public class basamak_toplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, toplam=0;
        System.out.println("Sayı:");
        number = input.nextInt();

        do{
            toplam = toplam + number%10;
            System.out.println(toplam);
            number = (number/10);
        }while(number>0);
        System.out.println("Toplam:"+toplam);
    }
}
