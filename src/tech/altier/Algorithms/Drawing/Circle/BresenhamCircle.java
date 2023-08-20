package tech.altier.Algorithms.Drawing.Circle;

import tech.altier.Algorithms.Drawing.lib.Point;

/**
 *  This class implements the Bresenham Circle algorithm
 *  @author Dilshan M. Karunarathne
 *  @version 1.0
 *  @see tech.altier.Algorithms.Drawing.lib.Point
 */
public class BresenhamCircle {
    /**
     * This method calculates the points in a circle using the Bresenham Circle algorithm
     * @param x0    The x coordinate of the center of the circle
     * @param y0    The y coordinate of the center of the circle
     * @param r     The radius of the circle
     * @return      An array of points in the circle
     * @see         tech.altier.Algorithms.Drawing.lib.Point
     */
    public static Point[] bresenhamCircle(int x0, int y0, int r) {
        // Calculate the first point
        int x = 0;
        int y = r;

        // Create an array of points to store the points in the circle
        Point[] points = new tech.altier.Algorithms.Drawing.lib.Point[4 * r];

        // Calculate the initial value of the decision parameter
        int d = 3 - (2 * r);

        // Set the first point
        points[0] = new tech.altier.Algorithms.Drawing.lib.Point(x + x0, y + y0);

        // Loop through the points
        int i = 1;
        while (y >= x) {
            // If the decision parameter is less than 0
            if (d < 0) {
                // Calculate the next value of the decision parameter
                d = d + (4 * x) + 6;
            } else {
                // Calculate the next value of the decision parameter
                d = d + (4 * (x - y)) + 10;

                // Decrement y
                y--;
            }

            // Increment x
            x++;

            // Calculate the next point
            points[i++] = new tech.altier.Algorithms.Drawing.lib.Point(x + x0, y + y0);
        }

        // Return the array of points
        return points;
    }
}
