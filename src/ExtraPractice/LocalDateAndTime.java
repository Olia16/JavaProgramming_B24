package ExtraPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.spi.LocaleServiceProvider;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

     /*
     Create a program that will ask the user to enter their birthday. Ask them what month
they were born (number), which day, and which year and print their birthday together in
a nice format
      */

        Scanner input = new Scanner(System.in);

        String bday = LocalDate.of(input.nextInt(),input.nextInt(), input.nextInt()).format(DateTimeFormatter.ofPattern("MMM/dd/yyyy"));
        System.out.println(bday);
    }



}
