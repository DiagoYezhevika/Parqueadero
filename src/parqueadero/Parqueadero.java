/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author undine
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        Moto m = new Moto();
        //Moto aux = new Moto();
        ArrayList<Moto> motos = new ArrayList<Moto>();
        
        
        m.setPlaca("placa4");
        motos.add(3, m);
        m.setPlaca("placa5");
        motos.add(4, m);
        
        for(Moto tmpObjeto : motos){
            System.out.println("# de Placa : " + tmpObjeto.getPlaca());
        }
        
        for(Moto tmpObjeto : motos){
            System.out.println(motos.get(i));
            i++;
        }
        
        motos.get(0).getMarca();
        
        for(Moto tmpObjeto : motos){
            System.out.println("# de Placa : " + tmpObjeto.getPlaca());
        }
    }
}
