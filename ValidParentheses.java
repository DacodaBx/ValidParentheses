import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        String s = "([](){})";
        System.out.println(isValid(s));
    }
public static boolean isValid(String s) {        

    Stack<Character> parenthesesStack = new Stack<>();
       for(int i = 0; i < s.length(); i++){
         char bracket = s.charAt(i);
         if(bracket == '(' || bracket ==  '{' || bracket == '['){
            parenthesesStack.push(bracket);
         } else if(parenthesesStack.isEmpty()){
            return false;
         } else if (bracket == ')' && parenthesesStack.peek() == '('){
            parenthesesStack.pop();
         } else if (bracket == '}' && parenthesesStack.peek() == '{'){
            parenthesesStack.pop();
         } else if (bracket == ']' && parenthesesStack.peek() == '['){
            parenthesesStack.pop();
         } else {
            return false;
         }
       }
            return parenthesesStack.isEmpty() ? true:false;
    }
}
