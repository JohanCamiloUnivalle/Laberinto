package com.laberinto;

import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

public class Jugador {
    private int x, y;
    private int width, height;
    private int Btop,Bleft,Bbottom,Bright;
    private boolean PressAbajo, PressArriba, PressDerecha, Pressizquierda;

    public Jugador(int x, int y, int Ancho, int Alto, int Btop, int Bleft, int Bbottom, int Brigth) {
            this.x = x;
            this.y = y;
            this.width = Ancho;
            this.height = Alto;
            this.Bbottom = Bbottom;
            this.Bleft = Bleft;
            this.Btop = Btop;
            this.Bright = Brigth;
    }
    
    public void ComprobarBottom(){
      if(Btop==EventosKey.idPress){
          PressArriba = true;
          PressAbajo = false;
          PressDerecha = false;
          Pressizquierda = false;
      }
      
      if(Bbottom==EventosKey.idPress ){
        PressArriba = false;
        PressAbajo = true;
        PressDerecha = false;
        Pressizquierda = false;
      }

      if(Bleft==EventosKey.idPress){
        PressArriba = false;
        PressAbajo = false;
        PressDerecha = false;
        Pressizquierda = true;
      }

      if(Bright==EventosKey.idPress){
        PressArriba = false;
        PressAbajo = false;
        PressDerecha = true;
        Pressizquierda = false;
      }

  }

    public Rectangle2D GetJugador(){
        return new Rectangle2D.Double(x,y,width,height);
    }

    public void mover(Rectangle limites){
      ComprobarBottom();
      if(PressArriba && y>=0){
        y--;
      }
      if(PressAbajo && y<=(limites.getMaxY()-height)){
        y++;
      }
      if(Pressizquierda && x>= 0){
        x--;
      }
      if(PressDerecha && x<=(limites.getMaxY()-width) ){
        x++;
      }
    }

    public void colision(Rectangle2D muro){
      if(GetJugador().intersects(muro)){
        x = 0;
        y = 0;
      }
    }
}
