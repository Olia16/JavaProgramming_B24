package day59_exceptions;

public class AllPeople {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setName("James");
        try{
            obj.setAge(40);
        }catch (Exception e){

        }
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

       // obj.setName(null); not valid
        try {
            obj.setAge(-20);
        }catch (Exception e){
            System.out.println("Invalid age");
        }



    }

}
