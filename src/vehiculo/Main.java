
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoAlonsoLopezDaniel2223 miVehiculoAlonsoLopezDaniel2223;
        int stockActual;
        
        operativaVehiculosAlonsoLopezDaniel2223(50);
    }

    private static void operativaVehiculosAlonsoLopezDaniel2223(int cantidad) {
        VehiculoAlonsoLopezDaniel2223 miVehiculoAlonsoLopezDaniel2223;
        int stockActual;
        miVehiculoAlonsoLopezDaniel2223 = new VehiculoAlonsoLopezDaniel2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoAlonsoLopezDaniel2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoAlonsoLopezDaniel2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoAlonsoLopezDaniel2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
