package tech.altier.Algorithms.Drawing.lib;

// This class represents the x, y coordinates of a point
public class Point {
    // This is the x coordinate of the point
    private int x;
    // This is the y coordinate of the point
    private int y;
    // This is a given identifier for the point
    private String id;

    // This is the constructor for the Point class
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This is the constructor for the Point class
    public Point (int x, int y, String id) {
        this (x, y);
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }

    // This method is used to print the coordinates of the points to the terminal
    public static void printPoints () {

    }
}
