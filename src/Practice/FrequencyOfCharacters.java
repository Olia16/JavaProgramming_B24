package Practice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String a = "opendoor";
        String duplicate = "";
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if(duplicate.contains(""+a.charAt(j))) continue;

                if(a.charAt(i)==a.charAt(j)){
                    count++;//1
                }
            }
            if(count>0){
                duplicate = ""+a.charAt(i);//op
                result += ""+a.charAt(i)+count;//03/1p/1e/1n
            }
        }
        System.out.println(result);

    }

    public static String frequencyOfCharacters(String str){

        String duplicate = "";
        String result = "";
        for(int i = 0; i < str.length(); i++){
            int count = 0 ;
            for(int j = 0; j < str.length(); j++){
                if(duplicate.contains("" + str.charAt(j))) continue;
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count > 0){
                duplicate = " "  +str.charAt(i);
                result += "" + count + str.charAt(i);
            }
        }
        return result;
    }

}
