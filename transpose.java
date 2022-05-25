import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matrisin satır sayısını giriniz: ");
        int line = input.nextInt();
        System.out.println("Matrisin sütun sayısını giriniz: ");
        int column = input.nextInt();
        int[][] matris = new int[line][column];
        for (int i = 0; i<line; i++){
            for (int j = 0; j<column; j++){
                System.out.printf("Matrisin %d. satır %d. sütun elemanını giriniz: ",i+1, j+1);
                matris[i][j] = input.nextInt();
            }
        }
        int[][] transpose = new int[column][line];

        for (int i=0;i<line;i++){
            for (int j=0;j<column;j++){
                transpose[j][i] = matris[i][j];
            }
        }
        for (int k=0; k<column; k++){
            for (int l=0; l<line; l++){
                System.out.print(transpose[k][l] + " ");
            }
            System.out.println();
        }
    }
}
