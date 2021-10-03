package day38_methods;


public class CountElements {

    public static void main(String[] args) {
        int [] a = {1, 2, 2, 2, 4, 2, 4, 2,5};

        System.out.println(frequencyOfElement(a, 2));
        System.out.println(frequencyOfElement(a, 5));
        System.out.println(frequencyOfElement(a, 10));

        System.out.println();

        getUniqueElements(a);
    }
    /*
    create method that accepts and int array and a number
    count and return the number of times the given number is found in the array
     */

    public static int frequencyOfElement(int [] arr, int element){
        int counter = 0;
        for(int each: arr){
            if(each == element){
                counter++;
            }
        }
        return counter;
    }

    public static void getUniqueElements(int [] nums){
        for(int each : nums){
            int counter = frequencyOfElement(nums, each);
            if(counter == 1){
                System.out.println(each);
            }
        }
    }


}
