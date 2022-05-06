import java.util.Scanner;
public class sifre_kontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanıcı_adı, sifre, sifre_tekrar;

        System.out.println("Kullanıcı Adı:");
        kullanıcı_adı = input.nextLine();
        System.out.println("Şifre:");
        sifre = input.nextLine();

        System.out.println("Şifre Tekrar:");
        sifre_tekrar = input.nextLine();

        if(sifre_tekrar.equals(sifre)){
        }
        else{
            System.out.println("Şifre yanlış. Değiştirmek ister misiniz? Evet/Hayır");
            String cevap;
            cevap = input.nextLine();
            if(cevap.equals("Evet")){
                String sifre_yeni;
                System.out.println("Yeni şifre:");
                sifre_yeni = input.nextLine();
                if(sifre_yeni.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else{
            }

        }
    }
}
