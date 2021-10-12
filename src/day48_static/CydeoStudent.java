package day48_static;

public class CydeoStudent {

    //instance variables
    String name;
    int id;
    int groupNum;

    static Coffee myCoffee;

    // static variables belong to the class
   static int batchNum;
   static String [] instructors;
   static String schoolName;

   public CydeoStudent(String name, int id, int groupNum){
       this.name = name;
       this.id = id;
       this.groupNum = groupNum;


   }

   static {
       batchNum = 24;
       instructors = new String[]{"Nadir", "Saim", "Murodil"};
       schoolName = "Cydeo";
       myCoffee = new Coffee("", 10);
   }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupNum=" + groupNum +
                '}';
    }
}
