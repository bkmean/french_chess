/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Objects;

/**
 *
 * @author Barcsy Károly
 */
public class Cell extends Position{
    private BGColor cellColor;
    private boolean empty;
    private Position position;

    public Cell(BGColor cellColor, boolean empty, int x, int y) {
        super(x, y);
        this.cellColor = cellColor;
        this.empty = empty;
    }

    public Cell(boolean empty, int x, int y) {
        super(x, y);
        this.empty = empty;
    }

    public BGColor getCellColor() {
        return cellColor;
    }

    public void setCellColor(BGColor cellColor) {
        this.cellColor = cellColor;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.position);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Position
                && getX() == ((Position) obj).getX()
                && getY() == ((Position) obj).getY();
    }
    
    
}
