package day19_string;

public class MultipleIndexes {
    public static void main(String[] args) {
        String word = "definition";
        System.out.println("First i position: " + word.indexOf('i'));
        System.out.println("Last i position: " + word.lastIndexOf('i'));

        int secondIHardCoded = word.indexOf('i', 8); // -> -1
        System.out.println(secondIHardCoded);
       // int secondIHardCoded = word.indexOf('i', 6); -> 7
       // int secondIHardCoded = word.indexOf('i', 4); -> 5


        int firstPos = word.indexOf('i');  // 3
        int secondPos = word.indexOf('i', firstPos + 1); //starts to from position 4.
        System.out.println(secondPos);

        int thirdPos = word.indexOf('i', secondPos + 1);
        System.out.println("First position: " + firstPos);
        System.out.println("Second position: " + secondPos);
        System.out.println("Third position: " + thirdPos);

        System.out.println();

        String a = "aaba";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('a', a.indexOf('a') + 1));



    }
}
