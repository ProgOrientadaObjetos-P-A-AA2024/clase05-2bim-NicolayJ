/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete08i;

/**
 *
 * @author reroes
 */
public class EvaluacionEnsayo implements EvaluacionTipoDos {

    private int numeroProblemas;
    private double totalProblemas;
    protected double promedioEnsayo;

    
    public void establecerNumeroProblemas(int n) {
        numeroProblemas = n;
    }

    public void establecerTotalProblemas(double n) {
        totalProblemas = n;
    }

    public int obtenerNumeroProblemas() {
        return numeroProblemas;
    }

    public double obtenerTotalProblemas() {
        return totalProblemas;
    }
    
    /*
    Los siguientes metodos son metodos que hacen uso de interfaces de Evaluacion
    Tipo Dos para ello alado del nombre de la clase se coloca implements que 
    indica el uso de una interfaz y es necesario usar obligatoriamente todos los
    metodos de la interfaz
    */
    @Override
    public void establecerPromedioEnsayo() {

        promedioEnsayo = obtenerTotalProblemas() / obtenerNumeroProblemas();

    }

    @Override
    public double obtenerPromedioEnsayo() {
        return promedioEnsayo;

    }
    
}
