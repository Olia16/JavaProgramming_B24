package IQ;

public class Finra_Q1 {

    public static String [] finra(){
        String [] arr = new String[30];
        for(int i = 1; i <= 30; i++){
            if( i % 3 == 0 && i % 5 == 0){
                arr[i-1] = "FINRA";
            }else if(i % 3 == 0){
                arr[i-1] = "FIN";
            }else if(i % 5 == 0){
                arr[i-1] = "RA";
            }else{
                arr[i-1] = "" + i;
            }
        }
        return arr;
    }

}
