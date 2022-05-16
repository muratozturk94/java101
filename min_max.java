import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1, number;
        System.out.println("Kaç tane sayı gireceksiniz:");
        number = input.nextInt();
        int min = 0, max = 0, x=0;
        while(i<number+1){
            System.out.println(i+". Sayıyı Giriniz: ");
            x = input.nextInt();
            if(x<min){
                min = x;
            }
            if(x>max){
                max = x;
            }
            i++;
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
