package office_hours.practice_08_25_2021;

public class MoveFirst {
    public static void main(String[] args) {
        String str = "Java is a fun language";
        System.out.println(str);

        int indexOfSpace = str.indexOf(" ");

        String remaining = str.substring(indexOfSpace).trim(); // str.substring(indexOfSpace + 1);
        String firstWord = str.substring(0, indexOfSpace);

        remaining = remaining.substring(0,1).toUpperCase() + remaining.substring(1);
        firstWord = firstWord.toLowerCase();

        System.out.println(remaining + " " + firstWord);
    }
}
