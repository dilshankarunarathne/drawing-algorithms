public class MidPointCircle {
    public static void main(String[] args) {
        midPointCircle(4, 7, 4);
    }

    public static void midPointCircle(int x0, int y0, int r) {
        int x = 0;
        int y = r;

        int d = 1 - r;

        drawCircle(x0, y0, x, y);

        while (y > x) {
            if (d < 0) {
                d = d + (2 * x) + 3;
            } else {
                d = d + (2 * (x - y)) + 5;

                y--;
            }

            x++;

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
