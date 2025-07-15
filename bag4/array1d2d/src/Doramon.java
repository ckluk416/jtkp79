import java.util.ArrayList;

public class Doramon {
    public static void main(String[] args){
        //membuat objek array lst
        ArrayList kantongAjaib = new ArrayList();

        //mengisi kantong ajib dg 5 benda
        kantongAjaib.add("senter pemvesar");
        kantongAjaib.add(533);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        //menghapus tikus dari kantog ajbia
        kantongAjaib.remove("tikus");

        //,ena,pilkan isi kantog ajaib
        System.out.println(kantongAjaib);

        //men,apilkan banyak isi kantogn ajaib
        System.out.format("kantog ajaib berisi %d item", kantongAjaib.size());
    }
}
