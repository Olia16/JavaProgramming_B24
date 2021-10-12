package day48_static;

public class MoreChaining {

    public MoreChaining(){
        System.out.println("First");
    }
    public MoreChaining(int i){
        // MoreChaining() -> cannot use just name without 'this'
        this();
    }
    public MoreChaining(String s){
        this(5);
       // this(s.length());
        System.out.println("String one");
       //  this(5); 'this ()' - always has to be the first line in method
    }
    public MoreChaining(double d){
        // this(10);
       // this("java");
        // we can only call one constructor
    }

    public MoreChaining(char c){
      //  this('d');
        // not possible to call method itself
    }

    /*
    public MoreChaining(float f){
        this(true);
    }
    public MoreChaining(boolean b){
        this(4.5f);
    }/ above is invalid because method are calling each other// cross calling
    *
     */

}
