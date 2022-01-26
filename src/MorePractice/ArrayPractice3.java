package MorePractice;

public class ArrayPractice3 {
    public static void main(String [] args){
        //Given a String of words that are separate by commas. Find and print any words
        //that have more than one word
        //Example
        //Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
        //dish washer”

        String input = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] strArr = input.split(", ");
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].trim().contains(" ")){
                System.out.println(strArr[i]);
            }
        }

    }


}
