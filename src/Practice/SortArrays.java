package Practice;

public class SortArrays {

    public static void main(String[] args) {

        int [] arr = {1,4,5};

        for(int i = 0; i < args.length; i++) {

            int [] newArr = new int[arr.length];
            for( int j = 0; j < arr.length; j++){
                if(newArr.equals(arr))continue;

                int low = 0;
                low = arr[i];
                arr[i] = arr[j];
                arr[j] = low;


                System.out.println();


            }
        }
    }
}
