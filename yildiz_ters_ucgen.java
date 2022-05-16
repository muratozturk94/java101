import java.util.Scanner;

public class yildiz_ters_ucgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak,i=1;
        System.out.println("Basamak Sayısı:");
        basamak = input.nextInt();
        for(i=1;i<=basamak;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(basamak-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
