import java.io.Console;

public class InputConsole {

    public static void main(String[] args){

        String nama;
        int usia;

        //membuat objek console
        Console con = System.console();

        //mengisi variabel nama dan usia dengan console
        System.out.print("input nama: ");
        nama = con.readLine();
        System.out.print("inputkan usia; ");
        usia = Integer.parseInt(con.readLine());

        //menampilakn isi variable nama dan usai
        System.out.println("namakamu adalah: " + nama);
        System.out.println("saat ini berusia: " + usia + "tahun");
    }
}
