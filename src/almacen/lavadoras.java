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
public class lavadoras extends almacen {
  
  private int libras;
  
  public lavadoras(String marca, String modelo) {
        super(marca, modelo);
        this.libras=0;
  }
  
   public lavadoras(String marca, String modelo, int precio, int cantidad){
           super(marca, modelo, precio, cantidad);
           this.libras = libras;
                   }

    public int getLibras() {
        return libras;
    }

    public void setLibras(int libras) {
        this.libras = libras;
    }

    @Override
    public String toString() {
        return "lavadoras{" + "libras=" + libras + '}';
    }
   
    
}
