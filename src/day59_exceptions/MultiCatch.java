package day59_exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        try{
            System.out.println(10/10);
            Thread.sleep(10);
        }catch (ArithmeticException e){
            System.out.println("Handled in Arithmetic block");
        }catch (RuntimeException e){
            System.out.println("Handled in runtime block");
        }catch (Exception e){
            System.out.println("Handled generally");
        }
    }
}
