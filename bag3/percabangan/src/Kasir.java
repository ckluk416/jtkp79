import java.util.Scanner;
public class Kasir {
    public static void main(String[] args){
        //deklarasi varabel dan scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("apakah anda kartu member: ");
        kartu = scan.nextLine();
        System.out.print("total belanjaan: ");
        belanjaan = scan.nextInt();

        //proses
        if(kartu.equalsIgnoreCase("ya")){
            if(belanjaan > 500000){
                diskon = 50000;
            } else if(belanjaan > 100000){
                diskon = 15000;
            } else{
                diskon = 0;
            }
        } else{
            if(belanjaan > 100000){
                diskon = 5000;
            } else{
                diskon = 0;
            }
        }

        //total yang harus dibayar
        bayar = belanjaan - diskon;

        //otuptu
        System.out.format("total bayar: rp %d ", bayar);
    }
}
