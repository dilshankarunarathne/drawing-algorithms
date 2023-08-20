import java.util.Scanner;

public class BresenhamCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x0: ");
        int x0 = scanner.nextInt();
        System.out.print("Enter y0: ");
        int y0 = scanner.nextInt();
        System.out.print("Enter r: ");
        int r = scanner.nextInt();

        bresenhamCircle(x0, y0, r);
    }

    public static void bresenhamCircle(int x0, int y0, int r) {
        int x = 0;
        int y = r;

        int d = 3 - (2 * r);

        drawCircle(x0, y0, x, y);

        while (y >= x) {
            if (d < 0) {
                d = d + (4 * x) + 6;
            } else {
                d = d + (4 * (x - y)) + 10;

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
