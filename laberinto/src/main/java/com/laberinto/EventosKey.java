package com.laberinto;
import java.awt.event.*;

public class EventosKey extends KeyAdapter {
  static int idPress; 
    static int idReleased;
    @Override
    public void keyPressed(KeyEvent e) {
        idPress = e.getKeyCode();
        System.out.println(idPress);
    }
    @Override
    public void keyReleased(KeyEvent e) {
        idReleased = e.getKeyCode();
        System.out.println("released" + idReleased);
    }
}
