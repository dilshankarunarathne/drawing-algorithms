public class BresenhamLine {
    public static void main(String[] args) {
        bresenhamLine(1, 1, 5, 4);
    }

public static void bresenhamLine(int x0, int y0, int x1, int y1) {
        int dx = Math.abs(x1 - x0);

        int dy = Math.abs(y1 - y0);

        int x = x0;

        int y = y0;

        int p = (2 * dy) - dx;

        int twoDy = 2 * dy;

        int twoDyMinusDx = 2 * (dy - dx);

        System.out.println("(" + x + ", " + y + ")");

        while (x < x1) {
            x++;

            if (p < 0) {
                p += twoDy;
            } else {
                y++;

                p += twoDyMinusDx;
            }

            System.out.println("(" + x + ", " + y + ")");
        }
    }

    
}
