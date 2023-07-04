
package cliente;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import sop_corba.*;

public class ClienteDeObjetos {

    static FacturaInt ref;
   
    public static void main(String[] args) {
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialPort";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vec[1] = UtilidadesConsola.leerCadena();
            vec[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vec[3] = UtilidadesConsola.leerCadena();

            // se crea e inicia el ORB
            ORB orb = ORB.init(vec, null);

            // se obtiene un link al name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // *** Resuelve la referencia del objeto en el N_S ***
            String name = "objUsuarios";
            ref = FacturaIntHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + ref);
                        
            int rta = 0;
            do {
                rta = menu();
                
                switch(rta){
                    case 1:
                        
                    break;                        
                    case 2:
                        
                    break;
                }
                
            }while(rta != 3);
            

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }
    
    private static int menu() {
        
        System.out.println(" :: MENU ::");
        System.out.println(" :1: Generar Factura");
        System.out.println(" :2: Salir");
        int rta = UtilidadesConsola.leerEntero();
        
        return rta;
        
    }
    
}
