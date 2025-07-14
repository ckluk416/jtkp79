public class OperatorPenugasan {

    public static void main(String[] args){
        int a;
        int b;

        //pengisian nilai
        a = 5;
        b = 10;

        //penambahan
        b += a;
        System.out.println("penambahan: " +b);

        // pengurangan
        b -= a;
        System.out.println("pengurangan " + b);

        //perkalian
        b *= a;
        System.out.println("perkalian: " +b);

        //pembagian
        b /= a;
        System.out.println("pembagian: " +b);

        //sisa bagi
        b %= a;
        System.out.println("sisa bagi: " +b);
    }
}
