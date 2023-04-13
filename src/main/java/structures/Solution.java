package structures;

import java.util.*;

public class Solution {
    protected int a;
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.add(')');
                    break;
                case '{':
                    stack.add('}');
                    break;
                case '[':
                    stack.add(']');
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != ')') return false;
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != ']') return false;
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '}') return false;
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }
}
