package tech.altier;

import static tech.altier.Algorithms.Drawing.DDA.dda;
import static tech.altier.Algorithms.Drawing.lib.Points.printPoints;

public class Main {
    public static void main(String[] args) {
        printPoints(dda(0, 0, 10, 10));
    }
}
