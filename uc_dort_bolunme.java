import java.util.Scanner;

public class uc_dort_bolunme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,i = 1,total = 0, sayi = 0;
        double ortalama;
        System.out.println("Sayı giriniz:");
        number = input.nextInt();
        while(i<number){
            if(i%3 == 0 && i%4 == 0){
                total = total + i;
                sayi++;
            }
            i++;
        }
        ortalama = total/sayi;
        System.out.println("Ortalama: " +ortalama);
    }
}
