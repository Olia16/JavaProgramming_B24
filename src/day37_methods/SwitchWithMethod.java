package day37_methods;

public class SwitchWithMethod {

    public static void main(String[] args) {
        System.out.println(numberToWord(7));
    }
    public static String convertNumberToWord(int number){
        String word="";
        switch (number){
            case 1: word="one"; break;
            case 2: word="two"; break;
            case 3: word="three"; break;
            case 4: word="four"; break;
            case 5: word="five"; break;
            case 6: word="six"; break;
            case 7: word="seven"; break;
            case 8: word="eight"; break;
            case 9: word="nine"; break;
            case 10: word="ten"; break;
            default: word="invalid entry";
        }
        return word;
    }


    public static String numberToWord(int a){
        switch (a){
            case 0: return "Zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            default: return "out of range";
        }
    }
}
