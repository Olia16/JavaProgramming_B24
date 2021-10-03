package day35_methods;

public class PersonInformation {
    public static void main(String[] args) {
        buildEmail("olha kobiuk", "gmail");
        buildEmail("adam smith", "yahoo");
        login("jbond007","bond007");
        /*
        building up email
        parameters: name(first and last), domain
        make email and print it
        ex: buildEmail("james bond", gmail")
        output: james_bond@gmail.com
         */
    }

    public static void buildEmail(String name, String domain){
       name = name.replace(" ", "_");
        System.out.println(name + "@" + domain + ".com");
    }
    public static void login(String username, String password){
        if(username.equals("jbond007") && password.equals("bond007")){
            System.out.println("Logged in!");
        }else{
            System.out.println("Invalid credentials! Try again!");
        }
    }
}
