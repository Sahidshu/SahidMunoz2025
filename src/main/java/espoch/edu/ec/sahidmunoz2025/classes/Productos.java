/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.sahidmunoz2025.classes;

/**
 *
 * @author sahid
 */
public class Productos {
    private String nombreP;
    private double precio;
    private Categorias categoria;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
    
    public void printInfo(){
        
        double precioIva=precio-(precio*0.12);
        
        System.out.println("Nombre: "+nombreP);
        System.out.println("Precio: "+precio);
        System.out.println("Categoria: "+categoria);
        System.out.println("Precio con IVA: "+precioIva);
        System.out.println("");
        
        
        
        
        
        
    }
    
    
    
}
