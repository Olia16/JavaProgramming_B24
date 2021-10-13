package Practice;

public class PasswordValidation {

//    public static boolean checkPassword(String password){
//        int lower = 0;
//        int upper = 0;
//        int num = 0;
//        int other = 0;
//        for(char each : password.toCharArray()){
//            if(Character.isUpperCase(each)){
//                upper++;
//            }else if(Character.isLowerCase(each)){
//                lower++;
//            }else if(Character.isDigit(each)){
//                num++;
//            }else {
//                other++;
//            }
//        }
//        return (lower != 0 && upper != 0 && num != 0 && other != 0);
//    }

    public static boolean passwordValidation(String password){


        int upper = 0, lower = 0, digit = 0, special = 0;

        if(password.length() >= 6 && !password.contains(" ")){
            for(char each : password.toCharArray()){
                if(Character.isUpperCase(each)){
                    upper++;
                }else if(Character.isLowerCase(each)){
                    lower++;
                }else if(Character.isDigit(each)){
                    digit++;
                }else {
                    special++;
                }
            }
        }

        return (upper > 0 && lower > 0 && digit > 0 && special > 0);
    }


   public static void main(String[] args) {
       System.out.println(passwordValidation("lAaa!2"));
   }
}
