import java.util.Scanner;


public class kelilingsegitiga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan sisi A :");
        double sisi_A = scanner.nextDouble();

        System.out.println("Masukan sisi B :");
        double sisi_B = scanner.nextDouble();

        System.out.println("Masukan sisi C :");
        double sisi_C = scanner.nextDouble();

        double keliling = sisi_A + sisi_B + sisi_C;
        System.out.println("Keliling dari segita adalah : " + keliling);

        scanner.close();

    }
}