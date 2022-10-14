package com.laberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

public class PanelJuego extends JPanel{
  private final int TamanoJugador = 20;

  private int Btop = KeyEvent.VK_UP , Bleft = KeyEvent.VK_LEFT, Bbottom = KeyEvent.VK_DOWN , Bright = KeyEvent.VK_RIGHT;
  private Jugador j1 = new Jugador(2,2,TamanoJugador,TamanoJugador,Btop,Bleft,Bbottom,Bright);

  private Cuadritos cuadrito1 = new Cuadritos(20, 40, 20, 109);
  private Cuadritos cuadrito2 = new Cuadritos(90, 40, 181, 20);

  private Color ColorFondo = new Color(0,0,0);
  private Color ColorBall = new Color(250,250,250);
  
  public PanelJuego(){
    setBackground(ColorFondo);
  }

  @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(ColorBall);
        draw(g2);
        refresh();
    }

    public void draw(Graphics2D g){
      g.fill(j1.GetJugador());
      g.fill(cuadrito1.GetCuadro());
      g.fill(cuadrito2.GetCuadro());
    }
    
    public void refresh(){
      j1.mover(getBounds());
      j1.colision(cuadrito1.GetCuadro());
      j1.colision(cuadrito2.GetCuadro());
    }
}
