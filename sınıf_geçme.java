import java.util.Scanner;
public class sınıf_geçme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik, ders_sayı, toplam;
        ders_sayı = 0;
        toplam = 0;
        double ortalama;

        System.out.println("Matematik Notu:");
        matematik = input.nextInt();
        if(matematik<=100 && matematik>=0){
            toplam = toplam + matematik;
            ders_sayı++;
        }

        System.out.println("Fizik Notu:");
        fizik = input.nextInt();
        if(fizik<=100 && fizik>=0){
            toplam = toplam + fizik;
            ders_sayı++;
        }

        System.out.println("Türkçe Notu:");
        turkce = input.nextInt();
        if(turkce<=100 && turkce>=0){
            toplam = toplam + turkce;
            ders_sayı++;
        }

        System.out.println("Kimya Notu:");
        kimya = input.nextInt();
        if(kimya<=100 && kimya>=0){
            toplam = toplam + kimya;
            ders_sayı++;
        }

        System.out.println("Müzik Notu:");
        muzik = input.nextInt();
        if(muzik<=100 && muzik>=0){
            toplam = toplam + muzik;
            ders_sayı++;
        }

        ortalama = toplam/ders_sayı;

        if(ortalama>=55){
            System.out.println("Sınıfı Geçtiniz.");
            System.out.println("Ortalamanız:"+ortalama);
        }
        else{
            System.out.println("Sınıfta Kaldınız.");
            System.out.println("Ortalamanız:"+ortalama);
        }
    }
}
