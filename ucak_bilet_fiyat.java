import java.util.Scanner;

public class ucak_bilet_fiyat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculuk_tipi;
        double normal_fiyat, yas_indirimi, indirimli_fiyat_yas, yon_indirimi, indirimli_fiyat_yon, yas_indirim_oranı, total_tek, total_cift;
        yas_indirim_oranı = 0.0;
        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz(1:Tek Yön, 2:Gidiş-Dönüş) : ");
        yolculuk_tipi = input.nextInt();



        if(yas<12){
            yas_indirim_oranı = 0.5;
        }
        else if(yas>=12 && yas<=24){
            yas_indirim_oranı = 0.1;
        }
        else if(yas>65){
            yas_indirim_oranı = 0.3;
        }
        else{
            yas_indirim_oranı = 0;
        }


        normal_fiyat = mesafe * 0.1;
        yas_indirimi = normal_fiyat * yas_indirim_oranı;
        indirimli_fiyat_yas = normal_fiyat - yas_indirimi;
        yon_indirimi = indirimli_fiyat_yas * 0.2;
        indirimli_fiyat_yon = indirimli_fiyat_yas - yon_indirimi;
        total_tek = indirimli_fiyat_yas;
        total_cift = 2 * indirimli_fiyat_yon;


        if(yas<1 || mesafe<1 || (yolculuk_tipi!=1 && yolculuk_tipi!=2)){
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else if(yolculuk_tipi == 1){
            System.out.println("Toplam Tutar: " +total_tek);
        }
        else{
            System.out.println("Toplam Tutar: "+total_cift);
        }
    }
}
