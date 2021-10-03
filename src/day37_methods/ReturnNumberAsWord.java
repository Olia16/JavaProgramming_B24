package day37_methods;

public class ReturnNumberAsWord {
    public static void main(String[] args) {

        System.out.println(convertNumberToWord(11));
        System.out.println(convertNumberToWord(10));
        System.out.println(convertNumberToWord(0));
    }

    public static String convertNumberToWord(int num) {
        if(num <= 0 || num > 10){
            return "Out of Range";
        }

            String [] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
           return words[num-1];

        }
    }

