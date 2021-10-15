package Practice;

public class MaxArr {

    /*
    Q9:Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */

    public static int max(int [] arr){

        int maxNum = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int [] a = {1, 2 , 5, 45, 3, 187};
        System.out.println(max(a));
    }
}
