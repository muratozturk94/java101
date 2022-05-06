import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplam, armut,armut_kilo, elma,elma_kilo, domates,domates_kilo, muz,muz_kilo, patlıcan,patlıcan_kilo;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlıcan = 5.00;

        System.out.println("Armut Kaç Kilo ?");
        armut_kilo = input.nextDouble();

        System.out.println("Elma Kaç Kilo ?");
        elma_kilo = input.nextDouble();

        System.out.println("Domates Kaç Kilo ?");
        domates_kilo = input.nextDouble();

        System.out.println("Muz Kaç Kilo ?");
        muz_kilo = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ?");
        patlıcan_kilo = input.nextDouble();

        toplam = (armut*armut_kilo)+(elma*elma_kilo)+(domates*domates_kilo)+(muz*muz_kilo)+(patlıcan*patlıcan_kilo);
        System.out.println("Toplam Tutar : "+toplam);
    }
}
