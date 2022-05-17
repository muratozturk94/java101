import java.util.Scanner;

public class plus_minus_five {

    static int minus_five(int x){
        if(x<=0){
            System.out.print(x+ " ");
            return x;
        }else{
            System.out.print(x+ " ");
        }
        return minus_five(x-5);
    }
    static int plus_five(int y, int z){
        if(y<z){
            System.out.print(y+ " ");
        }else if(y == z){
            System.out.print(y);
            return y;
        }
        return plus_five(y + 5, z);
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number = input.nextInt();
        int result_one = minus_five(number);
        plus_five(result_one+5, number);
    }
}
