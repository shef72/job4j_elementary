
package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result1 = (x2 - x1);
        double result2 = (y2 - y1);
        double result3 = Math.pow(result1, 2);
        double result4 = Math.pow(result2, 2);
        double result5 = (result3 + result4);
        double result6 = Math.sgrt(result5, 2);

        return result6;

    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}