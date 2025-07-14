import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferReader {

    public static void main(String[] args) throws IOException{
        String nama;

        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        //membuat objek buffereader
        BufferedReader br = new BufferedReader(isr);

        //mengisi variabel nama dengan buffereadr
        System.out.print("Input nama: ");
        nama = br.readLine();

        //tampilkan output isi variabel nama
        System.out.println("nama kamu adalah " + nama);
    }
}
