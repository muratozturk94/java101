import java.util.Scanner;
public class ucgen_alan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double u;
        double alan;

        System.out.println("a=");
        a = input.nextDouble();
        System.out.println("b=");
        b = input.nextDouble();
        System.out.println("c=");
        c = input.nextDouble();
        u = (a+b+c)/2.0;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan="+alan);
    }
}
