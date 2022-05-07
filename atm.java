import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        int right =3;
        int balance = 1500;
        int select;
        while(right>0){
            System.out.println("Kullanıcı Adı:");
            username = input.nextLine();
            System.out.println("Parola:");
            password = input.nextLine();

            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do{
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemei Seçiniz:");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para Miktarı:");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı:");
                            int price2 = input.nextInt();
                            if(price2>balance){
                                System.out.println("Bakiye Yetersiz.");
                            }
                            else{
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                    }
                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız:" + right);
                }
            }
        }
    }
}