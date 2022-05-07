import java.util.Scanner;

public class yildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Bir sayı giriniz:");
        x = input.nextInt();

        for(int i=0; i<x; i++){
            for(int j=0; j<(x-i-1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*i+1);k++){
                System.out.print("*");
            }
            for(int l=0; l<(x-i); l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        int bosluk = 1;
        for(int a=0; a<(x-1); a++){
            for(int b=0; b<bosluk;b++){
                System.out.print(" ");
            }
            bosluk++;
            for(int c=0; c<(2*(x-a-1)-1); c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
