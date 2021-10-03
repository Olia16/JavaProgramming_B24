package office_hours.practice_09_15_2021;

public class MultipleWords {
     /*
    Multiple Words
        Given a String of words that are separate by commas. Find and print any words that have more than one word
        Example
        Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
        Output: wooden spoons trash can
        dish washer
     */

    public static void main(String[] args) {

        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer, multiple word another word, home,  , mon day";

        String [] words = str.split(", ");

        for( String eachWord : words ){

            if(!eachWord.equals(" ") && eachWord.contains(" ")){
                System.out.println(eachWord);
            }

        }

    }
}
