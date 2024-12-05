/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.sahidmunoz2025;

import espoch.edu.ec.sahidmunoz2025.classes.Categorias;
import espoch.edu.ec.sahidmunoz2025.classes.Cliente;
import espoch.edu.ec.sahidmunoz2025.classes.Productos;

/**
 *
 * @author sahid
 */
public class SahidMunoz2025 {

    public static void main(String[] args) {
        
      
        Productos objProducto1=  new Productos();
   
        objProducto1.setNombreP("Pastel tres leches");
        objProducto1.setPrecio(3.50);
        objProducto1.setCategoria(Categorias.POSTRE);
        
        Productos objProducto2 = new Productos();
       
        objProducto2.setNombreP("Sushi");
        objProducto2.setPrecio(10);
        objProducto2.setCategoria(Categorias.ALIMENTO);
   
        Cliente objCliente1 = new Cliente();
        objCliente1.setNombreC("Sahid");
        
        objProducto2.printInfo();
        
        objProducto1.printInfo();
        
        objCliente1.pedidoInfo(objProducto1);
        
        
        
    }
}
