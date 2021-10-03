package day29_array;

public class MaxNumbers {
    public static void main(String[] args) {
        int [] numbers = { 6, 2, 8, 4};
        int max = numbers[0];

        if(numbers[0] > max){
            max = numbers[0];
        }
        if(numbers[1] > max){
            max = numbers[1];
        }
        if(numbers[2] > max){
            max = numbers[2];
        }
        if (numbers[3] > max){
            max = numbers[3];
        }

        System.out.println(max);
    }
}
