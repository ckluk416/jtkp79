import java.util.Scanner;

public class LampuLalulintas {
    public static void main(String[] args) {

        //membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}