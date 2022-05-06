import java.util.Scanner;
public class vucut_kitle_indeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+indeks);
    }
}
