import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){
        //deklarasi
        Double luas;
        int alas, tinggi;

        // membuat scanner baru
        Scanner baca = new Scanner(System.in);

        //input
        System.out.println("== program hitung luas segitiga ==");
        System.out.print("input alas: ");
        alas = baca.nextInt();
        System.out.print("imput tinggi: ");
        tinggi = baca.nextInt();

        //proses
        luas = Double.valueOf((alas * tinggi) / 2);

        //output
        System.out.println("Luas = " + luas);
    }
}
