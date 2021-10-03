package my_utilities;

public class ArraysUtil {

    // method with array
    // returns min number
    public static int minNumber(int [] arr){

        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }

        return min;
    }

    // method with array
    // returns max number
    public static int maxNumber(int [] arr){

        int max = arr[0];
        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    // method checks if array contains given number
    public static boolean contains(int [] arr, int num){
        for(int each : arr){
            if(each == num){
                return true;
            }
        }
        return false;
    }
   // method that gets us a sum of elements in array
    public static int sumOfElements(int[] arr){

        int sum = 0;

        for(int num : arr){

            sum += num;

        }
        return sum;
    }

    public static int [] addElement(int [] arr, int element){

        int [] newArr = new int [arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;
    }

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
