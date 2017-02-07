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
public class licuadoras extends almacen 
{
  private int velocidades;
  
  public licuadoras(String marca, String modelo) {
        super(marca, modelo);
        this.velocidades=0;
  }
  
   public licuadoras(String marca, String modelo, int precio, int cantidad, int velocidades){
           super(marca, modelo, precio, cantidad);
           this.velocidades = velocidades;
                   }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    @Override
    public String toString() {
        return "licuadoras{" + "velocidades=" + velocidades + '}';
    }
   
}
