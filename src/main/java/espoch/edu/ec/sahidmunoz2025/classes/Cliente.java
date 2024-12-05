/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.sahidmunoz2025.classes;
import espoch.edu.ec.sahidmunoz2025.classes.Productos;

/**
 *
 * @author sahid
 */
public class Cliente {
    private String nombreC;

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }
    
    public void pedidoInfo(Productos objProducto1){
        System.out.println("El cliente "+nombreC+" realizo un pedido de un/una "+objProducto1.getNombreP()+" el cual tiene un valor de: "+objProducto1.getPrecio()+" dolares");
       
}
}
