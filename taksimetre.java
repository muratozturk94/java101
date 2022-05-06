import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        km = input.nextInt();
        double fiyat, result, sabit;
        sabit = 20;
        fiyat = 10 + (km*2.2);
        result = (fiyat >= 20) ? fiyat : sabit;
        System.out.println(""+result);
    }
}
