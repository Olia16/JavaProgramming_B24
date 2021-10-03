package day13_multiple_branches;

public class Weather {
    public static void main(String[] args) {
        /*
        sunny,rainy,windy,snowy,foggy,cloudy
         */

        String weather = "windy";
        if (weather.equals("sunny")) {
            System.out.println("Its nice, go outside, ride a bike, code java");
        }else if(weather.equals("rainy")){
            System.out.println("Stay home, drink some tea, code java");
        }else if(weather.equals("windy")){
            System.out.println("Fly a kite and code java");
        }else if(weather.equals("snowy")){
            System.out.println("Cold outside,go snowboarding, go skiing, drink hot chocolate and code java");
        }else if(weather.equals("foggy")){
            System.out.println("Drive safe, its foggy");
        }else{
            System.out.println("not a valid type, but code java anyway");
        }
    }
}