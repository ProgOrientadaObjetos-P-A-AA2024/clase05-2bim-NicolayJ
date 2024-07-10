/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

public class TarjetaCredito {
    
    private String nombre;
    private String numero;
    
    public TarjetaCredito(String nom, String num){
        nombre = nom;
        numero = num;
    }
    
    public void establecerNombre(String nom){
        nombre = nom;
    }
    
    public void establecerNumero(String num){
        numero = num;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerNumero(){
        return numero;
    }
}
