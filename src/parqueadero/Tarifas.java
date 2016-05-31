/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

/**
 *
 * @author undine
 */
public class Tarifas {
    int idTarifa;
    int valor;
    String descripcion;

    Tarifas(int idTarifaP,int valorTarifa, String valorDescripcion){
        valor = valorTarifa;
        idTarifa = idTarifaP;
        descripcion = valorDescripcion;
    }
    
    Tarifas(){
        valor = 0;
        idTarifa = 0;
        descripcion = "";
    }
    
    public int getValor(){
        return valor;
    }
    
    public int getId(){
        return idTarifa;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setValor(int valorTarifa){
        valor = valorTarifa;
    }
    
    public void setValordia(int idTarifaP){
        idTarifa = idTarifaP;
    }
    
    public void setDescripcion(String valorDescripcion){
        descripcion = valorDescripcion;
    }
    
    
    
}