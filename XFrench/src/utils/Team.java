/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package utils;

/**
 *
 * @author Barcsy Károly
 */
public enum Team {
     WHITE("W"),
     BLACK("B");

    private final String display;

    private Team(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return display;
    }
}
