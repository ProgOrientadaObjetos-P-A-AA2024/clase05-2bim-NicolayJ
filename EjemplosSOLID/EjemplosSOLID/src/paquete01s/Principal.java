package paquete01s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("René", 39);
        Persona persona2 = new Persona("Santiango", 20);
        
        System.out.printf("%s\n", persona1.obtenerEdad());
        System.out.printf("%s\n", persona2.obtenerEdad());
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
        miLista.add(persona2);
        double promedio = persona1.promedioEdades(miLista);
        System.out.printf("%.2f\n", promedio);
    }
}










