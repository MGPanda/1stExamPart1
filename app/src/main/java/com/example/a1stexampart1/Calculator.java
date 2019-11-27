package com.example.a1stexampart1;

public class Calculator {
    private double mem;

    public String operate(String s, String op1, String op2) {
        double n1 = Double.valueOf(op1);
        double n2 = Double.valueOf(op2);
        try {
            switch (s) {
                case "add":
                    return Double.toString(n1 + n2);
                case "sub":
                    return Double.toString(n1 - n2);
                case "mul":
                    return Double.toString(n1 * n2);
                case "div":
                    return Double.toString(n1 / n2);
            }
        } catch (NumberFormatException nfe) {
            return "You can only write numbers. Please try again.";
        } catch (IllegalArgumentException iae) {
            return "You cannot divide by zero. Please try again.";
        }
        return "Operation was not successful. Please try again.";
    }

    public String memory(String s, String num) {
        try {
            switch (s) {
                case "mc":
                    mem = 0;
                    return Double.toString(mem);
                case "mr":
                    return Double.toString(mem);
                case "m-":
                    mem -= Double.valueOf(num);
                    return Double.toString(mem);
                case "m+":
                    mem += Double.valueOf(num);
                    return Double.toString(mem);
            }
        } catch (NumberFormatException nfe) {
            return "You can only write numbers. Please try again.";
        } catch (IllegalArgumentException iae) {
            return "You cannot divide by zero. Please try again.";
        }
        return Double.toString(mem);
    }
}
