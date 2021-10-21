package office_hours.practice_10_13_2021;

public class Chase {

    public static void main(String[] args) {
        //static variables, accessed by classname -> name.varName
        ScrumTeam.companyName = "Chase";
        ScrumTeam.ceo = "J.P.Morgan";
        ScrumTeam team = new ScrumTeam("Rashid", "Mykyta", 4);

        Developer dev1 = new Developer("Sydea", 10, "Senior Dev", 200000);
        team.addDeveloper(dev1);

        Developer dev2 = new Developer("Irina", 11, "Senior Developer", 200000);
        team.addDeveloper(dev2);

        Tester tester1 = new Tester("Olha", 7, "SDET", 150000);
        team.addTester(tester1);

        //we can make object directly inside method
        team.addTester(new Tester("Nadir", 5, "RPA", 1000000));

        System.out.println(team);
    }


}
