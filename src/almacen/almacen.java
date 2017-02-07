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
public class almacen {

    private String marca;
    private String modelo;
    private int precio;
    private int cantidad;

    

public almacen(String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = 0;
    this.cantidad = 0;
}

public almacen(String marca, String modelo, int precio, int cantidad){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = 0;
    this.cantidad = 0;
    
}

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString (){
         return "marca: " + marca + ",\nmodelo: " + modelo + ",\nprecio:" + 
                precio + ",\ncantidad: " + cantidad; 
    }
}
