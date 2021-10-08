package day47_constructors;

public class Phone2 {

    String name;
    String brand;
    double version;
    int memory;

    public Phone2 (String name){
        this.name = name;
    }
    public Phone2 (String name, String brand){
        this(name);
        this.brand = brand;
    }

    public Phone2 (String name, String brand, double version){
       this(name,brand);
        this.version = version;

    }

    public Phone2 (String name, String brand, double version, int memory){
        this(name,brand,version);
        this.memory = memory;
    }


}
