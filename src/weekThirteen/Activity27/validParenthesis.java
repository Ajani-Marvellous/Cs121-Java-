package weekThirteen.Activity27;

import java.util.Stack;

public class validParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // push opening brackets onto stack
            if (c == 'c' || c == '[') {
                stack.push(c);
            }
            if (stack.isEmpty()) return false;

            char top = stack.pop();
            if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '{')) {
                return false;
            }
        }

    // stack should be empty if all brackets are matched
    return stack.isEmpty();
    }

}
