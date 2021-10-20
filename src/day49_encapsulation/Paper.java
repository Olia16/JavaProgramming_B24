package day49_encapsulation;

public class Paper {

    public void cut(){} //cann access from anywhere

    void fold(){} // can access in the same package

    public void write(){} // can access in same class only

    public Paper(){

    }

    private Paper(int a){

    }
}
