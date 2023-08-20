package tech.altier;

import static tech.altier.Algorithms.Drawing.Circle.MidPointCircle.midPointCircle;
import static tech.altier.Algorithms.Drawing.Line.BresenhamLine.bresenhamLine;
import static tech.altier.Algorithms.Drawing.Line.MidPointLine.midPointLine;
import static tech.altier.Algorithms.Drawing.lib.Points.printPoints;

public class Main {
    public static void main(String[] args) {
        printPoints(BresenhamCircle(4, 7, 4));
    }
}
