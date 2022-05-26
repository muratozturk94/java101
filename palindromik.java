import java.util.Scanner;

public class palindromik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.print("Bir kelime giriniz:");
        word = input.nextLine();
        int length = word.length();
        int i = 0, j = length;
        boolean isp = true;
        for (i=0; i<length; i++){
            if(word.charAt(i) != word.charAt(j-1)){
                isp = false;
                break;
            }
            j--;
        }
        if(isp){
            System.out.print(word + " palindromik kelimedir.");
        }else{
            System.out.print(word + " palindromik kelime değildir.");
        }
    }
}
