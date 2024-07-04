package paquete04o;

public class TransporteAereo extends Transporte {

    private String cooperativaAerea;

    public void establecerCooperativaTaxi(String n) {
        cooperativaAerea = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20.00 + 1.00;
    }

    public String obtenerCooperativaTaxi() {
        return cooperativaAerea;
    }

}
