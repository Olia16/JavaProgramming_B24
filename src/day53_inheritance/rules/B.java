package day53_inheritance.rules;

public class B extends A{
    //cannot change signature if you want to override(name and parameter)
    @Override
    public int getNum(){
        return 5;
    }
}
