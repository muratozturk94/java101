import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,ebob=1,ekok=1,i=1,j=1;
        System.out.println("1.Sayı:");
        sayi1 = input.nextInt();
        System.out.println("2.Sayı:");
        sayi2 = input.nextInt();

        while(i<sayi1){
            if(sayi1%i == 0  &&  sayi2%i == 0){
                ebob = i;
            }
            i++;
        }

        while(j<(sayi1*sayi2)){
            if(j%sayi1 ==0  &&  j%sayi2 ==0){
                ekok = j;
                break;
            }
            j++;
        }
        System.out.println("EBOB:"+ebob);
        System.out.println("EKOK:"+ekok);
    }
}
