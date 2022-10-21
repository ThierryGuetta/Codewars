package kyu6.areaOfPolygonInsideCircle;

public class Kata {
    public static void main(String[] args) {
        System.out.println(areaOfPolygonInsideCircle(9,8));
    }

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {

        return  Math.round(0.5 * Math.pow(circleRadius, 2) * numberOfSides *
                Math.sin(Math.toRadians(360) / numberOfSides) * Math.pow(10, 3)) / Math.pow(10, 3);

    }
}