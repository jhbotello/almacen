/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

/**
 *
 * @author SENA
 */
public class televisores extends almacen 
{
  private int pulgadas;
  private String color;
  private boolean smarttv;

    public televisores(String marca, String modelo) {
        super(marca, modelo);
        this.pulgadas=0;
        this.color="";
        this.smarttv=false;
    }
    
    public televisores(String marca, String modelo, int precio, int cantidad){
        super(marca, modelo, precio, cantidad);
        this.pulgadas = pulgadas;
        this.color = color;
        this.smarttv = smarttv;
    }
       
    public int getPulgadas() {
        return pulgadas;
    }

    public String getColor() {
        return color;
    }

    public boolean isSmarttv() {
        return smarttv;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmarttv(boolean smarttv) {
        this.smarttv = smarttv;
    }

    @Override
    public String toString() {
        return "televisores{" + "pulgadas=" + pulgadas + ", color=" + color + ", smarttv=" + smarttv + '}';
    }
      
}         