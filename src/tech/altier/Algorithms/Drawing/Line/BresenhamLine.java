package tech.altier.Algorithms.Drawing.Line;

import tech.altier.Algorithms.Drawing.lib.Point;

/**
 *  This class represents the Bresenham Line algorithm
 *  @see tech.altier.Algorithms.Drawing.lib.Point
 *  @author Dilshan M. Karunarathne
 *  @version 1.0
 */
public class BresenhamLine {    // TODO bug
    public static Point [] bresenhamLine(int x0, int y0, int x1, int y1) {
        // Calculate the difference between the coordinates
        int dx = x1 - x0;
        int dy = y1 - y0;

        // Calculate the absolute value of the difference
        int dxAbs = Math.abs(dx);
        int dyAbs = Math.abs(dy);

        // Calculate the decision parameter
        int p = 2 * dyAbs - dxAbs;

        // Calculate the initial values of the coordinates
        int x = x0;
        int y = y0;

        // Create an array of points to store the points in the line
        Point [] points = new Point[dxAbs + 1];

        // Set the first point
        points[0] = new Point(x, y);

        // Loop through the points
        int i = 1;
        while (x < x1) {
            // If the decision parameter is less than 0
            if (p < 0) {
                // Calculate the next value of the decision parameter
                p = p + 2 * dyAbs;
            } else {
                // Calculate the next value of the decision parameter
                p = p + 2 * dyAbs - 2 * dxAbs;

                // Increment y
                y++;
            }

            // Increment x
            x++;

            // Calculate the next point
            points[i++] = new Point(x, y);
        }

        // Return the array of points
        return points;
    }
}
