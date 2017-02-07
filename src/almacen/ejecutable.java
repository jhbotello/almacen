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
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        televisores ListadoTelevisores []=new televisores[6];
        licuadoras ListadoLicuadoras[]=new licuadoras[6];
        lavadoras ListadoLavadoras[]=new lavadoras[6];
        
        ListadoTelevisores[0]=new televisores("Sony","ST3245");
        ListadoTelevisores[1]=new televisores("Samsung","SN9285");
        ListadoTelevisores[2]=new televisores("LG","L3245G",750000,6);
        ListadoTelevisores[3]=new televisores("Samsung","SN0825",890000,3);
        ListadoTelevisores[4]=new televisores("Sony","S3245",1450000,8);
        ListadoTelevisores[5]=new televisores("LG","L3756G",2250000,2);
        
        ListadoLicuadoras[0]=new licuadoras("Whirpool","WL324");
        ListadoLicuadoras[1]=new licuadoras("Samsung","SL4726");
        ListadoLicuadoras[2]=new licuadoras("Oster","O3243",75000,10);
        ListadoLicuadoras[3]=new licuadoras("Samsung","SL9325",89000,15);
        ListadoLicuadoras[4]=new licuadoras("Whirlpool","WL232",145000,5);
        ListadoLicuadoras[5]=new licuadoras("Oster","O3756",220000,5);
        
        ListadoLavadoras[0]=new lavadoras("Samsung","SL324");
        ListadoLavadoras[1]=new lavadoras("LG","LV215");
        ListadoLavadoras[2]=new lavadoras("Whirlpool","WL545",800000,5);
        ListadoLavadoras[3]=new lavadoras("Samsung","SL435",960000,7);
        ListadoLavadoras[4]=new lavadoras("LG","LL342",1200000,3);
        ListadoLavadoras[5]=new lavadoras("Centrales","CL324",600000,15);
        
        
        
    }
    
}
