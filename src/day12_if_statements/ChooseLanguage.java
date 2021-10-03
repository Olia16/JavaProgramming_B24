package day12_if_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChooseLanguage {
    /*
    add a new class ChooseLanguage
add main method
"Choose your language"
int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk in english, hello"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your language. Pick the number you want");
        System.out.println("\t1)English\n\t2)Spanish\n\t3)Turkish\n\t4)Russian\n\t5)French");
        int selection = input.nextInt();

        String message = "";
        if(selection == 1){
            message = "hello, thank for your call";
        }else if(selection == 2){
            message = "hola, gracias para llamar";
        }else if(selection == 3){
            message = "merhaba, aradiginiz icin tesekkurler";
        }else if(selection == 4){
            message = "privet, spasibo za vash zvonok";
        }else if(selection == 5){
            message = "Merci ,pour votre appel";
        }else{
            message = "lets talk in English";
        }
        System.out.println(message);


    }
}
