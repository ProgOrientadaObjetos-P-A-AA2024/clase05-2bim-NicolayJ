/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07i;

/**
 *
 * @author reroes
 */
public class EvaluacionObjetiva extends Evaluacion {

    private int numeroPreguntas;
    private double totalPreguntas;

    public void establecerNumeroPreguntas(int n) {
        numeroPreguntas = n;
    }

    public void establecerTotalPreguntas(double n) {
        totalPreguntas = n;
    }

    public int obtenerNumeroPreguntas() {
        return numeroPreguntas;
    }

    public double obtenerTotalPreguntas() {
        return totalPreguntas;
    }

    @Override
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }

    @Override
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }

    @Override
    public void establecerPromedioEnsayo() {
        throw new RuntimeException("Sin implementar establecerPromedioEnsayo");

    }

    @Override
    public double obtenerPromedioEnsayo() {
        throw new RuntimeException("Sin implementar obtenerPromedioEnsayo");

    }
}
