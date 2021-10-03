package day09_scanner_logical;

import java.sql.SQLOutput;

public class ReviewOperators {

    public static void main(String [] args){

        double budget = 1000;

        budget -= 200;

        boolean stillInBudget = budget >= 0;

        System.out.println("Budget after purchase:" + budget);
        System.out.println("Still in budget:" + stillInBudget);

        budget -= 500;
        stillInBudget = budget >= 0;
        System.out.println("Budget after purchase:" + budget);
        System.out.println("Still in budget:" + stillInBudget);

        System.out.println(budget != 300); //300 != 300
        System.out.println(budget != 300.5); // 300.0 != 300.5 - true

        System.out.println(budget-- == 300);
        System.out.println(--budget == 300);


        int i = 5;
        boolean b = (i = 3) == 5;
        System.out.println(i);
        System.out.println(b);

        System.out.println(false == !true);
        System.out.println(false != true);






    }

}
