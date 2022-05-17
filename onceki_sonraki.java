import java.util.Arrays;
import java.util.Scanner;

public class onceki_sonraki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int list[] = {15,12,788,1,-1,-778,2,0};
        System.out.println("Sayı giriniz:");
        int number = input.nextInt();
        list[0] = number;
        Arrays.sort(list);
        int a = Arrays.binarySearch(list,number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[a-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+list[a+1]);

    }
}
