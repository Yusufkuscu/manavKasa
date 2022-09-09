import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double tlArmut = 2.14, tlElma = 3.67, tlDomates = 1.11, tlMuz = 0.95, tlPatlican = 5.0 ;

        Scanner scan = new Scanner(System.in);
        String soru = "Kaç Kilo? : ";
        System.out.print("Armut" + soru);
        int kiloArmut = scan.nextInt();
        System.out.print("Elma " + soru);
        int kiloElma = scan.nextInt();
        System.out.print("Domates " + soru);
        int kiloDomates = scan.nextInt();
        System.out.print("Muz " + soru);
        int kiloMuz = scan.nextInt();
        System.out.print("Patlıcan " + soru);
        int kiloPatlican = scan.nextInt();

        double toplam = (tlArmut*kiloArmut) + (tlElma*kiloElma) + (tlDomates*kiloDomates) + (tlMuz*kiloMuz) + (tlPatlican*kiloPatlican);
        System.out.println("Toplam tutar : " + toplam);


    }
}
