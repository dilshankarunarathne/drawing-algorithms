package tech.altier;

import java.util.Scanner;

public class BasicLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x0: ");
        int x0 = scanner.nextInt();
        System.out.print("Enter y0: ");
        int y0 = scanner.nextInt();
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();

        basicLine(x0, y0, x1, y1);
    }

    private static void basicLine(int x0, int y0, int x1, int y1) {
        int dx = (x1 >= x0) ? (x1 - x0) : (x0 - x1);
        int dy = (y1 >= y0) ? (y1 - y0) : (y0 - y1);

        if (x1 >= x0 && y1 >= y0) { // positive slope and x1 >= x0
            int steps = (dx >= dy) ? dx : dy;

            float xInc = dx / (float) steps;
            float yInc = dy / (float) steps;

            float x = x0;
            float y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int i=0; i<steps; i++) {
                x += xInc;
                y += yInc;

                System.out.println("(" + (int) Math.round(x) + ", " + (int) Math.round(y) + ")");
            }
        } else if (x1 >= x0) { // negative slope and x1 >= x0
            int steps = (dx >= dy) ? dx : dy;

            float xInc = dx / (float) steps;
            float yInc = dy / (float) steps;

            float x = x0;
            float y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int i=0; i<steps; i++) {
                x += xInc;
                y -= yInc;

                System.out.println("(" + (int) Math.round(x) + ", " + (int) Math.round(y) + ")");
            }
        } else if (y1 >= y0) { // positive slope and x1 < x0
            int steps = (dx >= dy) ? dx : dy;

            float xInc = dx / (float) steps;
            float yInc = dy / (float) steps;

            float x = x0;
            float y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int i=0; i<steps; i++) {
                x -= xInc;
                y += yInc;

                System.out.println("(" + (int) Math.round(x) + ", " + (int) Math.round(y) + ")");
            }
        } else { // negative slope and x1 < x0
            int steps = (dx >= dy) ? dx : dy;

            float xInc = dx / (float) steps;
            float yInc = dy / (float) steps;

            float x = x0;
            float y = y0;

            System.out.println("(" + x0 + ", " + y0 + ")");

            for (int i=0; i<steps; i++) {
                x -= xInc;
                y -= yInc;

                System.out.println("(" + (int) Math.round(x) + ", " + (int) Math.round(y) + ")");
            }
        }
    }
}
