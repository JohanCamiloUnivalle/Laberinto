package com.laberinto;
import javax.swing.JFrame;

public class Ventana extends JFrame{
  private final int Ancho = 800, Alto = 400;

    private Hilo hilo;
    
    public Ventana(PanelJuego panel){
       
        setSize(Ancho,Alto);
        setLocationRelativeTo(null);
        setResizable(false);
        add(panel);
        addKeyListener(new EventosKey());
        hilo = new Hilo(panel);
        hilo.start();
    }
}
