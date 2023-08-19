package tech.altier.Algorithms.Drawing.lib;

/**
 *  This class represents the x, y coordinates of a point
 *  we can give an identifier for a point
 *  @version 1.0
 *  @author Dilshan M. Karunarathne
 */
public class Point {
    private int x;
    private int y;
    private String id;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

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
        return (id == null ? "Point (" + x + ", " + y + ")" : "Point " + id + " (" + x + ", " + y + ")");
    }
}
