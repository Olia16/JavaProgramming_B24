package day52_inheritance.lyft;

public class Drive {

    public static void main(String[] args) {

        Lyft lyft = new Lyft();
        System.out.println(lyft.calculateRate(5));

        LyftXL xl = new LyftXL();
        System.out.println(xl.calculateRate(5));

        Lux lux = new Lux();
        System.out.println(lux.calculateRate(5));
    }
}
