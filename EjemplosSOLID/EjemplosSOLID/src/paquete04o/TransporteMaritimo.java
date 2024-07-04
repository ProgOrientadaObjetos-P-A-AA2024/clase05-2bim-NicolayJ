package paquete04o;

public class TransporteMaritimo extends Transporte {
    private String cooperativaMaritima;
    
    public void establecerCooperativaTaxi(String n){
        cooperativaMaritima = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 20.00 + 0.8;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaMaritima;
    }
        
}