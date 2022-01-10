package day59_exceptions;

public class Recap {
    public static void main(String[] args) {
        int [] nums = {3, 5, 1,5};
        try{
        System.out.println(nums[2]);
        System.out.println(nums[10]);//unchecked exception
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("That was invalid index");
            System.out.println(nums[0]);
        }finally {
            System.out.println("DONE");
        }
    }
}
