package day53_inheritance.rules;

public class C extends A {
    //cannot change access modifier cause it is public, and they can only be made more accessible in overriding
    @Override
    public int getNum(){
        return 6;
    }

    //getName method can be changed tp protected or public access because they are more accessible. Or can stay default(same)
    @Override
    public String getName(){
        return "str";
    }

}
