import java.util.Scanner;

public class palindrom {
    static boolean isPalindrom(int number){
        int new_number=0;
        int last=0, temp=0;
        temp = number;
        while(temp != 0){
            last = temp%10;
            new_number = new_number*10 + last;
            temp = temp/10;
        }
        if(new_number == number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int nmbr;
        nmbr = input.nextInt();
        System.out.println(isPalindrom(nmbr));
    }
}
