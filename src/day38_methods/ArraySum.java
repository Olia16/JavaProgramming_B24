package day38_methods;

public class ArraySum {
    public static void main(String[] args) {

    }

    public static int sumOfElements(int[] arr){

        int sum = 0;

        for(int num : arr){

            sum += num;

        }
        return sum;
    }
}
