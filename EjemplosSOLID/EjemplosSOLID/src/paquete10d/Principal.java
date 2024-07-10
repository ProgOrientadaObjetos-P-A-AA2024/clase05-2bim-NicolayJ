/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {
    public static void main(String[] args) {
        
        APIDGo apiG = new APIDGo();
        apiG.establecerApiKey("180420");
        
        GeneradorPeliculas gpG = new GeneradorPeliculas();
        gpG.establecerLlave(apiG);
        gpG.establecerUrl("http://api.movie?api=");
        System.out.println(gpG.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIDisneyPlus apiD = new APIDisneyPlus();
        apiD.establecerApiKey("11045");
        
        GeneradorPeliculas gpD = new GeneradorPeliculas();
        gpD.establecerLlave(apiD);
        gpD.establecerUrl("https://api.movie?api=");
        System.out.println(gpD.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        
    }
}
