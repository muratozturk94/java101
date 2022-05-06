import java.util.Scanner;
class etkinlik_oneri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik;
        System.out.println("Sıcaklık:");
        sicaklik = input.nextInt();

        if(sicaklik<=5){
            System.out.println("Öneri: Kayak");
        }
        else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Öneri: Sinema");
        }
        else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Öneri: Piknik");
        }
        else{
            System.out.println("Öneri: Yüzme");
        }
    }
}
