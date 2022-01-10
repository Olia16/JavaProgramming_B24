package office_hours.practice_11_24_2021;

public class Examples {
    public static void main(String[] args)throws InterruptedException {

        int minutes = 50;
        if(minutes > 45){
            throw new BirdException(minutes);
        }

        Thread.sleep(4000);

        try{
            String s = "java";
            s.charAt(1000);
            int [] a = {3, 2, 5, 1, 5};
            System.out.println(a[100]);
        }catch (StringIndexOutOfBoundsException e){//will handle all the exception(out of bound), its parent of all
            System.out.println("String exception caught");
            System.out.println(e.getMessage());
            throw new RuntimeException("Failing on purpose");
        }catch ( IndexOutOfBoundsException e){
            System.out.println("parent catches");
            System.out.println( e.getMessage());
            e.printStackTrace();//print all the details about exception
        }finally {
            //this block will execute no matter what
            System.out.println("The End");
        }

    }
}
