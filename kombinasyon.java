import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, i=1,j=1,k=1, n_fak=1, r_fak=1, n_r_fak=1;
        double sonuc;
        System.out.println("N:");
        n = input.nextInt();
        System.out.println("r:");
        r = input.nextInt();
        while(i<=n){
            n_fak = n_fak * i;
            i++;
        }
        while(j<=r){
            r_fak = r_fak * j;
            j++;
        }
        while (k<=(n-r)){
            n_r_fak = n_r_fak * k;
            k++;
        }
        sonuc = n_fak/(r_fak * n_r_fak);
        System.out.println("Kombinasyon: " +sonuc);
    }
}
