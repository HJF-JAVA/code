package main.java;

import java.util.Stack;

/**
 * create by 柘木
 * 2018.12.19.12.16
 * 括号匹配
 */
public class ParentMatch {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' | c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                Character pop = stack.pop();
                if (c == ')' && pop != '(')
                    return false;
                if (c == ']' && pop != '[')
                    return false;
                if (c == '}' && pop != '{')
                    return false;
            }
        }

        return stack.isEmpty();

    }

}
