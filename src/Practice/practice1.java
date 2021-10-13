package Practice;

public class practice1 {

    public static boolean contains(String one, String two){

        boolean result = false;
        if(one.contains(two)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(contains("nadir", "ir"));
    }
}
