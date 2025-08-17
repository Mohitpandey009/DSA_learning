package stack.expression_conversion;

import java.util.Stack;

public class main {
    public static int priority(char opr){
        if (opr=='^')  return 3;
        else if (opr=='*' || opr=='/' || opr=='%') return 2;
        else if (opr=='+' || opr=='-') return 1;
        else  return -1;   
    }

    public static boolean isOperator(char ch){
        if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' || ch=='%') {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        
        // String infix = "a+b*c-(d/2)";
        String infix = "(a+b)*c-d+f";
        // String infix = "a+b*(c^d-e)";

        // System.out.println(InfixToPostfix(infix,0));
        // System.out.println(InfixToPrefix(infix));

        // String postfix = "ab+c*d-f+";
        // System.out.println(postfixToInfix(postfix));

        // String prefix = "+-*+abcdf";
        // System.out.println(prefixToInfix(prefix));

        String prefix = "+-*+abcdf";
        System.out.println(prefixToPostfix(prefix));

    }


    public static String InfixToPostfix(String expression,int prefix){
        // char[] chars = exp.toCharArray()
        StringBuilder str = new StringBuilder();
        Stack<Character> exp = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')) {
                str.append(ch);
            }else if (ch=='(') {
                exp.push(ch);
            }else if (ch==')') {
                while (!exp.empty() && exp.peek()!='(') {
                    // char ex = exp.pop();
                    str.append(exp.pop());
                }
            exp.pop(); //pop the opening bracess
            }else if (isOperator(ch)) {
                //here the major change for postfix we are also removing equal and prefix we aren't remove equal
                while (
                    !exp.empty() &&
                    (
                        priority(ch) < priority(exp.peek()) ||
                        (priority(ch) == priority(exp.peek()) && prefix != 1)
                    )
                ) {
                    str.append(exp.pop());
                }
                exp.push(ch);
            }
        }
        while (!exp.empty()) {
            str.append(exp.pop());
        }
        return str.toString();
    }

    public static String InfixToPrefix(String expression){
       StringBuilder str = new StringBuilder(expression);
       StringBuilder exp = new StringBuilder();
       str.reverse();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==')') {
                str.setCharAt(i,'(');
            }else if (str.charAt(i)=='(') {
                str.setCharAt(i,')');
            }
        }
       exp = new StringBuilder(InfixToPostfix(str.toString(),1));
       return exp.reverse().toString();
    }

    public static String postfixToInfix(String expression){
        Stack<String>stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (isOperator(ch)) {
                String str1 = stack.pop();
                String str2 = stack.pop();
                String add = "("+str2+String.valueOf(ch)+str1+")";
                stack.push(add);
            }else{
                stack.push(String.valueOf(ch));
            }
        }
        return stack.peek();
    }
   
    public static String prefixToInfix(String expression){
        Stack<String>stack = new Stack<>();
        for (int i=expression.length()-1;i>=0;i--) {
            char ch = expression.charAt(i);
            if (isOperator(ch)) {
                String str1 = stack.pop();
                String str2 = stack.pop();
                String add = "("+str1+String.valueOf(ch)+str2+")";
                stack.push(add);
            }else{
                stack.push(String.valueOf(ch));
            }
        }
        return stack.peek();
    }

    public static String prefixToPostfix(String expression){
        Stack<String>stack = new Stack<>();
        for (int i=expression.length()-1;i>=0;i--) {
            char ch = expression.charAt(i);
            if (isOperator(ch)) {
                String str1 = stack.pop();
                String str2 = stack.pop();
                String add = str1+str2+String.valueOf(ch);
                stack.push(add);
            }else{
                stack.push(String.valueOf(ch));
            }
        }
        return stack.peek();
    }

    
}
