package dasar;

public class Player {
    //define atribut
    String name;
    int speed;
    int healthPoint;

    //define method run
    void run(){
        System.out.format("%s is running...\n", name);
        System.out.format("speed: %d\n", speed);
    }

    //define method isded u/ cek nilai kesehatan(healthpoint)
    boolean isDead(){
        if(healthPoint <= 0) return true;
        return false;
    }
}
