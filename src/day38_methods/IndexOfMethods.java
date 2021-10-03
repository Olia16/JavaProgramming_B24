package day38_methods;

public class IndexOfMethods {

    public static void main(String[] args) {

        int [] arr = {1,2,5,8,7,9,5,145,8};
        System.out.println(indexOf(arr,8));

        String [] arr1 = {"a","b","c"};
        System.out.println(indexOf(arr1, "b"));
        System.out.println(indexOf(arr1, "A"));
    }
    /*
    create a method that will accept an array and an element
    return the index of the first occurrence of the element

    if the element does not exist we will return -1;

    start with ont array
    overload to work with String array
     */

    public static int indexOf(int [] nums, int element){

       for(int i = 0; i < nums.length; i++){
           if(nums[i] == element){
               return i;
           }
       }
       // default value
       return -1;
    }

    public static int indexOf(String [] arr, String element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equalsIgnoreCase(element)){
                return i;
            }
        }
        return  -1;
    }

}
