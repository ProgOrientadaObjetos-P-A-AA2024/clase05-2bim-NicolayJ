/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Banco banco = new Banco();
        banco.establecerNombre("Banco De Loja");
        TarjetaCredito tarjCredi = new TarjetaCredito("Visa", "12345", banco);
        
        MayorEdad representante = new MayorEdad("José", tarjCredi);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n"
                + "\tNombre del Banco: %s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre());
        
    }
}
