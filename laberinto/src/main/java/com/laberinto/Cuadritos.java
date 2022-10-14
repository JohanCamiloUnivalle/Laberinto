package com.laberinto;

import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;

public class Cuadritos {
  private int x, y;
  private int width, height;
 

  public Cuadritos(int x, int y, int Ancho, int Alto) {
          this.x = x;
          this.y = y;
          this.width = Ancho;
          this.height = Alto;
}

  public Rectangle2D GetCuadro(){
      return new Rectangle2D.Double(x,y,width,height);
  }
}
