package day56_polymorphism.animal;

public class Lizard extends Reptile{

    @Override
    public void eat() {
        System.out.println("Lizard is eating  -> from child");
    }
}

class Wild{
    public static void main(String[] args) {
        //make your Lizard object will all references
        Lizard  obj1 = new Lizard();//reference is Lizard obj1
        Reptile obj2 = new Lizard(); //reference is reptile obj2
        Animal  obj3 = new Lizard(); //reference is animal obj3

        obj1.eat();
        obj2.eat();
        obj3.eat();






    }
}
