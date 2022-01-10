package office_hours.practice_12_08_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    /*
    * [IQ] Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.
https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
Ex: {([])} -> balanced
	{[(])} -> not balanced
	*
	* {([))} stack ->
	*           [
	*           (
	*           {
	*
	* [ == ) -> not balanced
	*
	*
     */

    public boolean isBalanced(String str){

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}'); map.put('(',')'); map.put('[',']');
        Stack<Character> stack = new Stack<>();

        /*
        // {{}}(((
        charAt 3 -> ]
                stack:
                    (
                    {
         */

        for(int i = 0; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            } else {
                if(stack.isEmpty() || str.charAt(i) != map.get(stack.pop())){  // ] != map.get('['] -> ] != ]
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

}
