import java.util.Scanner;

public class DataKaryawan {

    public static void main(String[] args){
        //deklarasi variabel
        String nama, alamat;
        int usia, gaji;

        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //tampilkan output ke user
        System.out.println("### pendataan karyawan jtk p79 ###");
        System.out.print("nama karyawan: ");
        //mnggunakan scanner dan menyimpan apa yang di ketik di var nama
        nama = keyboard.nextLine();
        //tampilkn output lagi
        System.out.print("alamat: ");
        //menggunakan scnaer lagu
        alamat = keyboard.nextLine();

        System.out.print("usia: ");
        usia = keyboard.nextInt();

        System.out.print("gaji: ");
        gaji = keyboard.nextInt();

        //menampilkan apa yg sdh di simpan di variabel
        System.out.println("------------");
        System.out.println("nama karyawan: " + nama);
        System.out.println("alamat: " + alamat);
        System.out.println("usia "+ usia+ " tahun");
        System.out.println("gaji: rp "+ gaji);
    }
}
