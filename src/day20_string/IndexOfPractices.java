package day20_string;

public class IndexOfPractices {
    public static void main(String[] args) {
        String word = "banana";
        int firstA = word.indexOf('a');
       //  int middleA = word.indexOf('a',2); // hard coded
        int middleA = word.indexOf('a',firstA + 1);
      //  int lastA = word.lastIndexOf('a');
        int lastA = word.indexOf('a',middleA + 1);


        System.out.println(firstA);
        System.out.println(middleA);
        System.out.println(lastA);

        System.out.println();
        String s = "001011010";

        int posOne = s.indexOf('1');
        int postTwo = s.indexOf('1',posOne + 1);
        int postThree = s.indexOf('1', postTwo + 1);
        int postFour = s.indexOf('1', postThree + 1);
        int postFive = s.indexOf('1', postFour + 1);




        System.out.println(posOne);
        System.out.println(postTwo);
        System.out.println(postThree);
        System.out.println(postFour);
        System.out.println(postFive);
    }
}
