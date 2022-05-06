import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fiyat;
        fiyat = input.nextInt();
        double kdv_fiyat;
        double kdv_sekiz;
        double kdv_onsekiz;
        kdv_sekiz = (fiyat * 108) / 100;
        kdv_onsekiz = (fiyat * 118) / 100;
        kdv_fiyat = (fiyat<1000) ? kdv_onsekiz : kdv_sekiz;
        System.out.println("KDV'li fiyat=" + kdv_fiyat );
        double kdv_tutar;
        kdv_tutar = kdv_fiyat - fiyat;
        System.out.println("KDV tutarı=" + kdv_tutar);

    }

}
