import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        //penjumlahan
        System.out.println("== penjumlahan ==");
        System.out.print("input angka ke-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka ke-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        //pengurangan
        System.out.println("== pengurangan ==");
        System.out.print("input angka ke-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka ke-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 - angka2;
        System.out.println("hasil = " + hasil);

        //perkalian
        System.out.println("== perkalian ==");
        System.out.print("input angka ke-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka ke-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 * angka2;
        System.out.println("hasil =" + hasil);

        //pembagian
        System.out.println("== pembagian ==");
        System.out.print("input angka ke-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka ke-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 / angka2;
        System.out.println("hasil = " + hasil);

        //modulus
        System.out.println("== sisa bagi ==");
        System.out.print("input angka ke-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("input angka ke-2: ");
        angka2 = keyboard.nextInt();

        hasil = angka1 % angka2;
        System.out.println("hasil = " + hasil);
    }
}