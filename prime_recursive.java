import java.util.Scanner;

public class prime_recursive {
    static boolean isPrime(int x, int y){
        if(x<=2){
            if(x==2)
                return true;
            else
                return false;
        }
        if(x%y == 0){
            if(x != y)
                return false;
            else
                return true;
        }
        return isPrime(x, y+1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number = input.nextInt();
        boolean result = isPrime(number,2);
        if (result == true){
            System.out.print("ASAL");
        } else if (result == false) {
            System.out.print("ASAL DEĞİL");
        }

    }
}
