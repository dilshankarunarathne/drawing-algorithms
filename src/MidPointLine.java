import java.util.Scanner;

public class MidPointLine {
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

        midPointLine(x0, y0, x1, y1);
    }

    private static void midPointLine(int x0, int y0, int x1, int y1) {
    }
}
