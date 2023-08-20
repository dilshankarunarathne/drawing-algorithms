import java.util.Scanner;

public class BresenhamLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
    }

    public static void bresenhamLine(int x0, int y0, int x1, int y1) {
        int dx = (x1 >= x0) ? (x1 - x0) : (x0 - x1);
        int dy = (y1 >= y0) ? (y1 - y0) : (y0 - y1);

        int d = 2 * dy - dx;

        int incrE = 2 * dy;
        int incrNE = 2 * (dy - dx);

        if (x1 >= x0 && y1 >= y0) { // positive slope and x1 >= x0
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
        } else if (x1 >= x0) { // negative slope and x1 >= x0
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
        } else if (y1 >= y0) { // positive slope and x1 < x0
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
        } else { // negative slope and x1 < x0
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
