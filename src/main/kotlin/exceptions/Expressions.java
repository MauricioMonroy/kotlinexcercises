package exceptions;

import java.lang.Integer;

public class Expressions {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;
        boolean result = c ^ b ^ a ^ d;
        System.out.println(result);
    }
}

// The idea is evaluated the expression c ^ b ^ a ^ d
// It is posible introduce a breakpoint in the line 12 and evaluate other boolean expressions
// Use the combination ALT + F8 to open the Evaluate Expression window
// For example:
// a && b
// a || d
// !c
// (a && b) || (c && d)
// a ^ d
// (a || b) && (!c || d)
// etc.
// Try different combinations of a, b, c, and d to see how the result changes.