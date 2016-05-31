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
    int hourIngreso;
    int hourSalida;
    int minIngreso;
    int minSalida;
    int valorPagado;
    int idTarifa;
    
    Moto(){
        placa = "";
        marca = "";
        tipo = 0;
        horaIngreso = "";
        horaSalida = "";
        hourIngreso = 0;
        hourSalida = 0;
        minIngreso = 0;
        minSalida = 0;
        valorPagado = 0;
        idTarifa = 0;
    }
    
    Moto(String nuevaPlaca,String nuevaMarca,int nuevoTipo, String nuevaHorai,String nuevaHoras){
        placa = nuevaPlaca;
        marca = nuevaMarca;
        tipo = nuevoTipo;
        horaIngreso = nuevaHorai;
        horaSalida = nuevaHoras;
        hourIngreso = 0;
        hourSalida = 0;
        minIngreso = 0;
        minSalida = 0;
        valorPagado = 0;
        idTarifa = 0;
    }
    
    Moto(String nuevaPlaca,String nuevaMarca,String nuevaHorai, int hourI, int minuteI,int nuevoIdTarifa){
        placa = nuevaPlaca;
        marca = nuevaMarca;
        tipo = 0;
        horaIngreso = nuevaHorai;
        horaSalida = "";
        hourIngreso = hourI;
        hourSalida = 0;
        minIngreso = minuteI;
        minSalida = 0;
        valorPagado = 0;
        idTarifa = nuevoIdTarifa;
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
    
    public int getHourI() {
        return hourIngreso;
    }
    
    public int getHourS() {
        return hourSalida;
    }
    
    public int getMinuteI() {
        return minIngreso;
    }
    
    public int getMinuteS() {
        return minSalida;
    }
    
    public int getValorPagado() {
        return valorPagado;
    }
    
    public int getIdTarifa() {
        return idTarifa;
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
    
    public void setHourI(int nuevoHourI) {
        hourIngreso = nuevoHourI;
    }
    
    public void setHourS(int nuevoHourS) {
        hourSalida = nuevoHourS;
    }
    
    public void setMinS(int nuevoMinS) {
        minSalida = nuevoMinS;
    }
    
    public void setMinI(int nuevoMinI) {
        minIngreso = nuevoMinI;
    }
    
    public void setValorPagado(int nuevoValorPagado) {
        valorPagado = nuevoValorPagado;
    }
    
    public void setIdTarifa(int nuevoIdTarifa) {
        idTarifa = nuevoIdTarifa;
    }
}
