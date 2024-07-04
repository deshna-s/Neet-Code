/*
Validate Parentheses
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise. 
*/


import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>(); 
        for (char c : s.toCharArray()) { 
            if (c == '(') 
                stack.push(')'); 
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c) 
                return false;
        }

        return stack.isEmpty();

        
    }
}
