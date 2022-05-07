import java.util.Scanner;

public class us_alma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, us, total=1, i;
        System.out.println("Taban Sayı:");
        taban = input.nextInt();
        System.out.println("Üs");
        us = input.nextInt();

        for(i=0;i<us;i++){
            total = total*taban;
        }
        System.out.println("Sonuç" +total);
    }
}
