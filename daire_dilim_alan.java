import java.util.Scanner;
public class daire_dilim_alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap, aci, pi, alan;
        pi = 3.14;
        System.out.println("Yarıçap:");
        yaricap = input.nextDouble();

        System.out.println("Açı:");
        aci = input.nextDouble();

        alan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Alan="+alan);
    }
}
