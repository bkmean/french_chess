/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Barcsy Károly
 */
public class Position {

    private int x;
    private int y;
    public static final int MAXRANGE = 8;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
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

    public boolean isValidPosition() {
        return getX() >= 0 && getX() < MAXRANGE
                && getY() >= 0 && getY() < MAXRANGE;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.x;
        hash = 73 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Position
                && this.x == ((Position) obj).x
                && this.y == ((Position) obj).y;
    }

    @Override
    public String toString() {
        return " " + x + "," + y + " ";
    }

}
