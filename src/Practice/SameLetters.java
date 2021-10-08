package Practice;

import java.util.Arrays;

public class SameLetters {

    public static boolean sameLetter(String a, String b){

        char [] aArr = a.toCharArray();
        char [] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        boolean same = false;

        if(aArr.length == bArr.length){
            for(int i = 0; i < aArr.length; i++){
                if(Arrays.equals(aArr,bArr)){
                    same = true;
                }
            }
        }
        return same;
    }

    public static void main(String[] args) {
        System.out.println(sameLetter("abc","acb"));
        System.out.println(sameL("abc","abd"));
    }

    public static boolean sameL(String a, String b){

        char [] aArr = a.toCharArray();
        char [] bArr = b.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        return Arrays.equals(aArr,bArr);
    }
}
