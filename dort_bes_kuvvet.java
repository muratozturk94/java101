import java.util.Scanner;

public class dort_bes_kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i=0;
        System.out.println("Sınır:");
        number = input.nextInt();

        for (i=1;i<number;i*=4){
            System.out.println(i);
        }
        for (i=1;i<number;i*=5){
            System.out.println(i);
        }
    }
}
