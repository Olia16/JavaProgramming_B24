package Practice;

public class PasswordValidation {

    public static boolean checkPassword(String password){
        int lower = 0;
        int upper = 0;
        int num = 0;
        int other = 0;
        for(char each : password.toCharArray()){
            if(Character.isUpperCase(each)){
                upper++;
            }else if(Character.isLowerCase(each)){
                lower++;
            }else if(Character.isDigit(each)){
                num++;
            }else {
                other++;
            }
        }
        return (lower != 0 && upper != 0 && num != 0 && other != 0);
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("Aaa12!2"));
    }
}
