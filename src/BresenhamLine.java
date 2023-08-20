public class BresenhamLine {
    public static void main(String[] args) {
        bresenhamLine(1, 10, 12, 5);
    }

    public static void bresenhamLine(int x0, int y0, int x1, int y1) {
        int dx = (x1 >= x0) ? (x1 - x0) : (x0 - x1);
        int dy = (y1 >= y0) ? (y1 - y0) : (y0 - y1);

        if (x1 >= x0 && y1 >= y0) { // positive slope and x1 >= x0
            int dx = x1 - x0;
            int dy = y1 - y0;

            int d = 2 * dy - dx;

            int incrE = 2 * dy;
            int incrNE = 2 * (dy - dx);

            int y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int x=x0+1; x<=x1; x++) {
                if (d > 0) {
                    y++;
                    d += incrNE;
                } else {
                    d += incrE;
                }

                System.out.println("(" + x + ", " + y + ")");
            }
        } else if (x1 >= x0 && y1 < y0) { // negative slope and x1 >= x0
            int dx = x1 - x0;
            int dy = y0 - y1;

            int d = 2 * dy - dx;

            int incrE = 2 * dy;
            int incrNE = 2 * (dy - dx);

            int y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int x=x0+1; x<=x1; x++) {
                if (d > 0) {
                    y--;
                    d += incrNE;
                } else {
                    d += incrE;
                }

                System.out.println("(" + x + ", " + y + ")");
            }
        } else if (x1 < x0 && y1 >= y0) { // positive slope and x1 < x0
            int dx = x0 - x1;
            int dy = y1 - y0;

            int d = 2 * dy - dx;

            int incrE = 2 * dy;
            int incrNE = 2 * (dy - dx);

            int y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int x=x0-1; x>=x1; x--) {
                if (d > 0) {
                    y++;
                    d += incrNE;
                } else {
                    d += incrE;
                }

                System.out.println("(" + x + ", " + y + ")");
            }
        } else if (x1 < x0 && y1 < y0) { // negative slope and x1 < x0
            int dx = x0 - x1;
            int dy = y0 - y1;

            int d = 2 * dy - dx;

            int incrE = 2 * dy;
            int incrNE = 2 * (dy - dx);

            int y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int x=x0-1; x>=x1; x--) {
                if (d > 0) {
                    y--;
                    d += incrNE;
                } else {
                    d += incrE;
                }

                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
