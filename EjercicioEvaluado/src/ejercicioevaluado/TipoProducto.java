/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicioevaluado;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public enum TipoProducto {
    Alimento;
    Limpieza;
    Bebidas;
    Higiene;
    public double calcularPrecio(double precioBase){
        switch (this) {
            case Alimento:
                return(precioBase* 0.20);
            case Higiene:
                return(precioBase* 0.30);
            case Limpieza:
                return(precioBase* 0.25);
            case Bebidas:
                return(precioBase* 0.19);
            default:
                JOptionPane.showMessageDialog(null, "tipo de producto no encontrado");
        }
       
    }
}
