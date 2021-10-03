package day11_if_statements;

public class CheckNumbers {
    public static void main(String[] args) {
        int numOne = 40;
        int numTwo = 6;

        if(numOne > numTwo){
            System.out.println(numOne + " is bigger");
        }
        else {
            System.out.println(numTwo + " is bigger");

        }
        int year = 2021;
        if(year == 2020 || year == 2021){
            System.out.println("In lockdown");
            System.out.println("Stay at home");
        }
        char letter = 'e';
        if(letter == 'E' || letter =='e'){
            System.out.println("letter is e");
        }else{
            System.out.println(letter + " is not e");
        }
    }
}
