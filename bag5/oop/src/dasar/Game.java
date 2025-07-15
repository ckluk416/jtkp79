package dasar;

public class Game {
    public static void main(String[] args){
        //membuat objek player
        Player mhs = new Player();

        //mengisi atribut player
        mhs.name = "fulan";
        mhs.speed = 79;
        mhs.healthPoint = 0;

        //menjalankan method
        mhs.run();

        if(mhs.isDead()){
            System.out.println("game over!");
        }


        //drone
        Drone droniey = new Drone();
        droniey.energi = 100;
        droniey.ketinggian = 1;
        droniey.kecepatan = 20;
        droniey.merek = "asimov";
        droniey.maju();
        droniey.matikanMesin();
        //droniey.turun();
        //droniey.matikanMesin();
    }
}
