package exceptions;

import java.lang.Math;

public class Triangle_area {
    public static void main(String[] args) {
        int a = 15;
        int b = 7;
        int c = 10;
        int p1 = (a + b + c) / 2;
        double s = Math.sqrt(p1 * ((p1 - a * p1 - b) * (p1 - c)));
        System.out.println(s);
    }
}

// In this code the line 10 has an error in the formula for calculating the area of the triangle using Heron's formula. The correct formula should be:
// double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
// The idea is to put a breakpoint on line 10 and inspect the values of a, b, c, and p1 to ensure they are correct before the area calculation.
