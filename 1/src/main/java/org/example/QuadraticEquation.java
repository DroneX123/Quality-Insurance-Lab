package org.example;

public class QuadraticEquation {
    public static String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be zero");
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "No real roots";
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return "One root: " + root;
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Two roots: " + root1 + " and " + root2;
        }
    }   
}
