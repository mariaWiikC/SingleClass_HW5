package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    Point point1 = new Point(5, 4);
        Point point2 = new Point(3, -2);

        // determining whether the point is on the x-axis
        System.out.println("Point 1 is on the x-axis: " + point1.isOnX());

        // same coordinates
        System.out.println("Points have the same coordinates: " + point1.sameCoordinates(point2));

        // distance from other point
        System.out.println("Distance between points: " + point1.distance(point2));

        // point in Unit Circle
        System.out.println("Point 2 is in the unit circle: " + point2.inUnitCircle());

        // midpoint of the line between two points
        System.out.println("Midpoint of the line between two points: " + point1.midOfTwo(point2));
    }
}
