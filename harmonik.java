import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double total = 0.0, i = 1.0;
        System.out.println("Sayı:");
        number = input.nextInt();
        while(i<=number){
            total = total + (1/i);
            i++;
        }
        System.out.println("Sonuç:" +total);
    }
}
