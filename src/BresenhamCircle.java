public class BresenhamCircle {
    public static void main(String[] args) {

    }

    public static void bresenhamCircle(int x0, int y0, int r) {

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
