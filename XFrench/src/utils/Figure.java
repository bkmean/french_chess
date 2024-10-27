/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

/**
 *
 * @author Barcsy Károly
 */
public interface Figure {
    Team getTeam();

    Position getPosition();

    Cell cellToStrike();

    Cell cellToMove();

    void move(Position moveTo);

    String sign();
}
