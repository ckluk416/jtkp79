package dasar;

public class Drone {
    //atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    //method
    void terbang(){
        if(energi > 10){
            //terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("dron tebanf..");
        } else{
            System.out.println("energi lemah: dron gk kuat terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("mesin tidak bisa dimatikan karena sedang tebangr");
        } else{
            System.out.println("mesin dimatikan..");
        }
    }

    void turun(){
        //ketinggian berkurang karena turun
        ketinggian--;
        energi--;
        System.out.println("dron turun");
    }

    void belok(){
        energi--;
        System.out.println("dron belok tanpa arah tujuan..");
    }

    void maju(){
        energi--;
        System.out.println("dron maju");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("dron mundur");
    }
}
