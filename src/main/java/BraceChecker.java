import java.util.*;

/**
 * @author Bischev Ramil
 * @since 2019-10-30
 * "(){}[]"   =>  True
 * "([{}])"   =>  True
 * "(}"       =>  False
 * "[(])"     =>  False
 * "[({})](]" =>  False
 */

public class BraceChecker {
    private final Character openBracket = '[';
    private final Character closeBracket = ']';
    private final Character openCurly = '{';
    private final Character closeCurly = '}';
    private final Character openPrntsis = '(';
    private final Character closePrntsis = ')';

    public boolean isValid(String braces) {
        Stack<Character> stack = new Stack<Character>();
        if (braces.charAt(0) == closeBracket || braces.charAt(0) == closeCurly || braces.charAt(0) == closePrntsis) {
            return false;
        } else {
            stack.push(braces.charAt(0));
        }
        for (int i = 1; i < braces.length(); i++) {
            if (braces.charAt(i) == openBracket || braces.charAt(i) == openCurly || braces.charAt(i) == openPrntsis) {
                stack.push(braces.charAt(i));
            }
            if (braces.charAt(i) == closeBracket || braces.charAt(i) == closeCurly || braces.charAt(i) == closePrntsis) {
                if (isEquals(stack.peek(), braces.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean isEquals(Character ch1, Character ch2) {
        if ((ch1 == '(' && ch2 == ')') || (ch1 == '[' && ch2 == ']') || (ch1 == '{' && ch2 == '}')) {
            return true;
        }
        return false;
    }
}
