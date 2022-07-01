import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates=1.11;
        double Muz = 0.95;
        double Patlıcan = 5.0;

        Scanner input = new Scanner(System.in);

        System.out.println("kaç kg Armut aldın");

        double kg_armut = input.nextDouble();
        System.out.println("kaç kg Armut aldın");
        double kg_Elma = input.nextDouble();
        System.out.println("kaç kg elma aldın");
        double kg_Domates =input.nextDouble();
        System.out.println("kaç kg domates aldın");
        double kg_Muz =    input.nextDouble();
        System.out.println("kaç kg patlıcan aldın");
        double kg_Patlıcan = input.nextDouble();

        double armut_tutar =  kg_armut * Armut;
        double elma_tutar =  kg_armut * Elma;
        double Domates_tutar =  kg_armut * Domates;
        double Muz_tutar =  kg_armut * Muz;
        System.out.println("armut tutar:"+ armut_tutar + " elma tutar:" + elma_tutar  + " domates tutar:"+ Domates_tutar   + "muz tutar: "+ Muz_tutar);
        double toplam_tutar = (armut_tutar+elma_tutar+Domates_tutar+Muz_tutar );
        System.out.println("toplam tutar:" + toplam_tutar);
    }
}
