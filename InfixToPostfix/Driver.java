package InfixToPostfix;

import java.util.Scanner;

public class Driver {

    static ArrayStack stack = new ArrayStack(10);

    static String postfixExpression = "";

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        System.out.println("Input infix expression: ");
        // String infixExpression = cin.nextLine();

        String infixExpression = "1 + 1";

        Scanner scan = new Scanner(infixExpression);

        while (scan.hasNext()) {

            String x = scan.next();

            if (Character.isLetterOrDigit(x.charAt(0))) {
                postfixExpression += x;

            } else {
                if (stack.isEmpty()) {
                    // System.out.println("Pushed: "+x);
                    stack.push(x);
                } else {
                    checkPrecendence(x);
                }
            }

        }

        emptyStack();

        System.out.println(postfixExpression);

    }

    static void checkPrecendence(Object x) {

        char top = ((String) stack.top()).charAt(0);
        char input = ((String) x).charAt(0);

        if (stack.top().equals(x)) {
            stack.push(x);
            // System.out.println("Pushed: "+x);

        } else if (Prec(top) == Prec(input)) {
            stack.push(x);
            // System.out.println("Pushed: "+x);

        } else if (Prec(top) > Prec(input)) {

            while (Prec(top) > Prec(input)
                    || Prec(top) == Prec(input)) {

                stack.pop();
                postfixExpression += top;
                top = ((String) stack.top()).charAt(0);
            }

            stack.push(x);
        }
        ;

    }

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // empties stack and add popped elements to string
    static void emptyStack() {
        while (!stack.isEmpty()) {
            String popped = (String) stack.pop();
            postfixExpression += popped;
        }
    }

}