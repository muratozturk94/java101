import java.util.Scanner;
public class not_ortalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz, toplam;
        double ortalama;
        System.out.println("Matematik Notu:");
        mat = input.nextInt();

        System.out.println("Fizik Notu:");
        fiz = input.nextInt();

        System.out.println("Kimya Notu:");
        kim = input.nextInt();

        System.out.println("Türkçe Notu:");
        tur = input.nextInt();

        System.out.println("Tarih Notu:");
        tar = input.nextInt();

        System.out.println("Müzik Notu:");
        muz = input.nextInt();

        toplam = mat+fiz+kim+tur+tar+muz;
        ortalama = toplam/6.0;

        System.out.println("Ortalama: "+ortalama);
        String result = (ortalama >= 60.0) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("" + result);
    }
}
