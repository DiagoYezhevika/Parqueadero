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
public class Persona {
    int tipo;
    String tipoPersona;
    
    Persona() {
        tipo = 0;
        tipoPersona = "";
    }
    
    Persona(int nuevoTipo, String nuevoTipopersona) {
        tipo = nuevoTipo;
        tipoPersona = nuevoTipopersona;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public String getTipopersona() {
        return tipoPersona;
    }
    
    public void setTipo(int nuevoTipo){
        tipo = nuevoTipo;
    }
    
    public void setTipopersona(String nuevoTipo) {
        tipoPersona = nuevoTipo;
    }
}
