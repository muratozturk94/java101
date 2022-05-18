import java.util.Scanner;

public class array_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutu :");
        int n = input.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for(int i = 0; i<n; i++){
            System.out.print(i+1 + ". eleman :" );
            list[i] = input.nextInt();
        }

        for (int a=0;a<n;a++) {
            for (int j = n - 1; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        for (int k=0; k<n; k++){
            System.out.print(list[k] + " ");
        }
    }
}
