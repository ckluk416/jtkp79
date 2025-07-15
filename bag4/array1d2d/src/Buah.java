import java.util.Scanner;

public class Buah{
    public static void main(String[] args){
        //membuat aray bubuahan
        String[] buah = new String[5];
        //membuat scanner
        Scanner scan = new Scanner(System.in);
        //mengisi data ke arr
        for(int i = 0; i < buah.length; i++){
            System.out.format("buah ke-%d: ", i+1);
            buah[i] = scan.nextLine();
        }
        System.out.println("-------------------------");
        //menampilkan semua isi arr
        for(String b : buah){
            System.out.println(b);
        }
    }
}