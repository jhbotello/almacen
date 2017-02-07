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
public interface Control {
    public void vender(int cantidad);
    public String existen();
    public boolean isExisten();  
}
