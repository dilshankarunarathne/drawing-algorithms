import tech.altier.Algorithms.Drawing.lib.Point;

public class BresenhamCircle {
    public static Point[] bresenhamCircle(int x0, int y0, int r) {
        // Calculate the first point
        int x = 0;
        int y = r;

        // Create an array of points to store the points in the circle
        Point[] points = new Point[4 * r];

        // Calculate the initial value of the decision parameter
        int d = 3 - (2 * r);

        // Set the first point
        points[0] = new Point(x + x0, y + y0);

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

            // Check if the index is within the bounds of the array
            if (i < points.length) {
                // Calculate the next point
                points[i++] = new Point(x + x0, y + y0);
            }
        }

        // Return the array of points
        return points;
    }

    private static void drawCircle(int x0, int y0, int x, int y) {
        System.out.println("(" + (x + x0) + ", " + (y + y0) + ")");
        System.out.println("(" + (y + x0) + ", " + (x + y0) + ")");
        System.out.println("(" + (-x + x0) + ", " + (y + y0) + ")");
        System.out.println("(" + (-y + x0) + ", " + (x + y0) + ")");
        System.out.println("(" + (-x + x0) + ", " + (-y + y0) + ")");
        System.out.println("(" + (-y + x0) + ", " + (-x + y0) + ")");
        System.out.println("(" + (x + x0) + ", " + (-y + y0) + ")");
        System.out.println("(" + (y + x0) + ", " + (-x + y0) + ")");
    }
}
