public class BresenhamLine {
    public static void main(String[] args) {
        bresenhamLine(0, 1, 5, 9);
    }

    public static void bresenhamLine(int x0, int y0, int x1, int y1) {
        if (x1 >= x0 && y1 >= y0) { // 1st quadrant
            int dx = x1 - x0;
            int dy = y1 - y0;

            int d = 2 * dy - dx;

            int incrE = 2 * dy;
            int incrNE = 2 * (dy - dx);

            int y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int x=x0; x<=x1; x++) {
                if (d > 0) {
                    y++;
                    d += incrNE;
                } else {
                    d += incrE;
                }

                System.out.println("(" + x + ", " + y + ")");
            }
        }

    }
}
