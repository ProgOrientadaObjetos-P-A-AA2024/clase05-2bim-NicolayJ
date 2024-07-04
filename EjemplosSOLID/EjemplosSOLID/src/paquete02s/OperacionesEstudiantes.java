/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerEdadMinima() {
        edadminima = 100;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() < edadminima) {
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerEdadMaxima() {
        edadmaxima = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() > edadmaxima) {
                edadmaxima = estudiantes.get(i).obtenerEdad();
            }
        }
    }

    public void establecerListCiudad() {
        String cadena ="";
        
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%s%s\n",
                    cadena,
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
    }

    public int obtenerEdadMinina() {
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        return edadmaxima;
    }

    public String obtenerListaCiudades() {
        return listaCiudadesEstudiantes;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\tLISTA DE EDADES DE ESTUDIANTES\n");
        
        for (int i = 0; i < estudiantes.size(); i++) {
            cadena = String.format("%s\n"
                    + "Nombre: %s\tEdad: %d\t Ciudad: %s",
                    cadena,
                    estudiantes.get(i).obtenerNombre(),
                    estudiantes.get(i).obtenerEdad(),
                    estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
        
        cadena = String.format("%s\n\n"
                + "Promedio: %.2f\n"
                + "Edad minima: %d\n"
                + "Edad maxima: %d\n",
                cadena,
                promedioEdades,
                edadminima,
                edadmaxima);
        
        return cadena;
    }

}
