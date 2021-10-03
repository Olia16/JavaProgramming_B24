package day26_unit2recap;

import java.util.Scanner;

public class HTMLGenerator {
    /*
    Given a String in the following format take the number part of the generator the html tags

    Ex:
        Input:
            div^2
        Output:
            <div></div><div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What HTML tag would you like to generate?");
        String str = input.nextLine();  //li^3

        String tag = str.substring(0, str.indexOf("^"));

        int indexOfCarrot = str.indexOf("^");
        String strNum = str.substring(indexOfCarrot + 1);

        int num = Integer.parseInt(strNum);
        String html = "";

        for(int i = 0; i < num; i++){
            html += "<" + tag + ">" + "</" + tag + ">";
        }
        System.out.println(html);
    }
}
