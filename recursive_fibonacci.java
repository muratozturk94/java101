import java.util.Scanner;

public class recursive_fibonacci {

    static int fibonacci(int number){
        if(number == 1){
            return 1;
        }else if(number == 2){
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number-2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fib;
        System.out.println("Sayı giriniz:");
        fib = input.nextInt();
        System.out.println(fibonacci(fib));
    }
}
