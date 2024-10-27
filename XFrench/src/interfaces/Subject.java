/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Barcsy Károly
 */
public interface Subject {
      
    public void register(Observer observer);

    public void deregister(Observer observer);

    public void notifyObservers();
}
