public class BresenhamCircle {
    public static void main(String[] args) {

    }

    public static void bresenhamCircle(int x0, int y0, int r) {
        // Calculate the first point
        int x = 0;
        int y = r;

        // Calculate the initial value of the decision parameter
        int d = 3 - (2 * r);

        // Set the first point
        drawCircle(x0, y0, x, y);

        // Loop through the points
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
            drawCircle(x0, y0, x, y);
        }
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
