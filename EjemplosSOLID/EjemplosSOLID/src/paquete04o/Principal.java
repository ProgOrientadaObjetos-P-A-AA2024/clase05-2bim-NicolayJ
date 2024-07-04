/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04o;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        // TransporteTransvia transvia
        TransporteTransvia t1 = new TransporteTransvia();
        t1.establecerCooperativaTransvia("Rutas Loja");
        t1.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaTaxi("Los Andes");
        aereo.establecerTarifa();
        
        TransporteMaritimo maritimo = new TransporteMaritimo();
        maritimo.establecerCooperativaTaxi("Los Vagres");
        maritimo.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t1);
        lista.add(aereo);
        lista.add(maritimo);
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
