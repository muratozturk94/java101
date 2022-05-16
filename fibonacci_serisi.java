import java.util.Scanner;

public class fibonacci_serisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,number1 = 0, number2 =1, number3=0, x=0;
        System.out.println("Eleman sayısı:");
        number = input.nextInt();

        while(x<number){
            System.out.print(number1+" ");
            number3=number1+number2;
            number1 = number2;
            number2 = number3;
            x++;
        }

        }
}
