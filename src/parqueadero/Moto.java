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
public class Moto {
    String placa;
    String marca;
    int tipo;
    String horaIngreso;
    String horaSalida;
    
    Moto(){
        placa = "";
        marca = "";
        tipo = 0;
        horaIngreso = "";
        horaSalida = "";
    }
    
    Moto(String nuevaPlaca,String nuevaMarca,int nuevoTipo, String nuevaHorai,String nuevaHoras){
        placa = nuevaPlaca;
        this.marca = nuevaMarca;
        this.tipo = nuevoTipo;
        this.horaIngreso = nuevaHorai;
        this.horaSalida = nuevaHoras;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getHoraingreso() {
        return horaIngreso;
    }
    
    public String getHorasalida() {
        return horaSalida;
    }
    
    public int getTipo() {
        return tipo;
    }
    
    public void setPlaca(String nuevaPlaca) { 
        placa = nuevaPlaca; 
    }
    
    public void setMarca(String nuevaMarca) { 
        marca = nuevaMarca; 
    }
    
    public void setHoraingreso(String nuevaHoraingreso) {
        horaIngreso = nuevaHoraingreso;
    }
    
    public void setHorasalida(String nuevaHorasalida) {
        horaSalida = nuevaHorasalida;
    }
    
    public void setTipo(int nuevoTipo) {
        tipo = nuevoTipo;
    }
}
