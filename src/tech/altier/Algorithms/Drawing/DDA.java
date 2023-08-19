package tech.altier.Algorithms.Drawing;

import tech.altier.Algorithms.Drawing.lib.Point;

public class DDA {
    /**
     * This method calculates the points in a line using the DDA algorithm
     * @see Point
     * @param x1    The x coordinate of the first point
     * @param y1    The y coordinate of the first point
     * @param x2    The x coordinate of the second point
     * @param y2    The y coordinate of the second point
     * @return
     */
    public static Point[] dda(int x1, int y1, int x2, int y2) {
        // Calculate the difference between the two points
        int dx = x2 - x1;
        int dy = y2 - y1;

        // Calculate the number of steps needed to draw the line
        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        // Calculate the increment in x and y
        float xInc = dx / (float) steps;
        float yInc = dy / (float) steps;

        // Create an array of points to store the points in the line
        Point[] points = new Point[steps + 1];

        // Set the first point
        points[0] = new Point(x1, y1);

        // Loop through the steps
        for (int i = 1; i <= steps; i++) {
            // Calculate the next point
            int x = Math.round(x1 + (i * xInc));
            int y = Math.round(y1 + (i * yInc));

            // Add the point to the array
            points[i] = new Point(x, y);
        }

        // Return the array of points
        return points;
    }
}
