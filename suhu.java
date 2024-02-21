import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan suhu dalam Reamur:");
        double suhuR = scanner.nextDouble();

        double suhuC = 1.25 * suhuR;
        double suhuF= (2.25 * suhuR) + 32;
        double suhuK = suhuC + 273.15;

        System.out.println("Suhu dalam Celcius: " + suhuC);
        System.out.println("Suhu dalam Fahrenheit: " + suhuF);
        System.out.println("Suhu dalam Kelvin: " + suhuK);

        scanner.close();
    }
}