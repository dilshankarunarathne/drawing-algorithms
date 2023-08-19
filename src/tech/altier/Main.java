package tech.altier;

import static tech.altier.Algorithms.Drawing.DDA.dda;
import static tech.altier.Algorithms.Drawing.lib.Points.printPoints;

public class Main {
    public static void main(String[] args) {
        printPoints(dda(4, 7, 10, 14));
    }
}
