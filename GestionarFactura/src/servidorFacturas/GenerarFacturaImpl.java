/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorFacturas;

import java.io.FileWriter;
import java.io.IOException;
import sop_corba.FacturaIntPOA;
import sop_corba.FacturaIntPackage.facturaDTO;


/**
 *
 * @author LENOVO
 */
public class GenerarFacturaImpl extends FacturaIntPOA{

   
    @Override
    public facturaDTO generarFactura(String nombres, String apellidos, String nombreProducto, float valorInicialOferta, float valorFinalOferta) {
        facturaDTO factura = new facturaDTO();

        try {
            String nombreArchivo = nombres + "_" + apellidos + "_" + nombreProducto + ".txt";
            FileWriter archivo = new FileWriter(nombreArchivo);

            // Escribir los datos en el archivo
            archivo.write("Nombre: " + nombres + " " + apellidos + "\n");
            archivo.write("Producto: " + nombreProducto + "\n");
            archivo.write("Valor inicial de la oferta: " + valorInicialOferta + "\n");
            archivo.write("Valor final de la oferta: " + valorFinalOferta + "\n");

            // Cerrar el archivo
            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al generar la factura: " + e.getMessage()); 
        }

        return factura;
    }
}
    
