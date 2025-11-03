import java.util.Scanner;

public class soalmudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan dari pengguna
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

         // Mengecek apakah bilangan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        input.close();

    }
}