package Practice;

public class PermutationCombinations {
    public static void main(String[] args) {
        char [] arr = {'a', 'b', 'c'};
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr.length; y++) {
                for (int x = 0; x < arr.length; x++) {
                    if (i != y && y != x && x != i) {
                        result += "" + arr[i] + arr[y] + arr[x] + "\n";
                    }
                }
            }
        }
        System.out.println(result);
    }
}
