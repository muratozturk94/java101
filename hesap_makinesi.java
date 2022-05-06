import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, islem;

        System.out.println("1. sayı:");
        number1 = input.nextInt();
        System.out.println("2. sayı:");
        number2 = input.nextInt();
        System.out.println("Toplama için 1, Çıkarma için 2, Çarpma için 3, Bölme için 4");
        islem = input.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplam = "+(number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma = "+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpma = "+(number1*number2));
                break;
            case 4:
                switch(number2){
                    case 0:
                        System.out.println("Sayı sıfıra bölünemez.");
                        break;
                    default:
                        System.out.println("Bölme = "+(number1/number2));
                        break;
                }
        }
    }
}
