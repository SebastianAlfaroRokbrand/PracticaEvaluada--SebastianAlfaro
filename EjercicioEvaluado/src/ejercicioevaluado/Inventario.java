/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioevaluado;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author sebas
 */
public class Inventario {
    private Supermercado supermercado;
    private Empleado empleado;
    private Productos[] productos;

    /**
     * Flujo principal del sistema.
     */
    public void iniciar() {
        solicitarDatosGenerales();
        int total = Entrada.leerEntero("¿Cuántos productos distintos desea ingresar?", 1);
        productos = new Productos[total];
        solicitarProductos();
        mostrarProductos();
        mostrarGananciaTotal();
    }

    /**
     * Solicita los datos del super y del empleado que realiza la carga.
     */
    public void solicitarDatosGenerales() {
        String nombreSuper = Entrada.leerTexto("Nombre del super:");
        String codigoSuper = Entrada.leerTexto("Código del super:");
        supermercado = new Supermercado(nombreSuper, codigoSuper);

        String nombreEmpleado = Entrada.leerTexto("Nombre del empleado que realiza la carga:");
        String cedulaEmpleado = Entrada.leerTexto("Cédula del empleado:");
        empleado = new Empleado(nombreEmpleado, cedulaEmpleado);
    }

    /**
     * Recorre el arreglo solicitando la información de cada producto.
     */
    public void solicitarProductos() {
        for (int i = 0; i < productos.length; i++) {
            JOptionPane.showMessageDialog(null, "Datos del producto " + (i + 1) + " de " + productos.length);
            String codigo = Entrada.leerTexto("Código del producto:");
            String nombre = Entrada.leerTexto("Nombre del producto:");
            int cantidad = Entrada.leerEntero("Cantidad de productos a ingresar:", 1);
            double precioBase = Entrada.leerDecimal("Precio base del producto:");
            TipoProducto tipo = Entrada.leerTipoProducto();
            productos[i] = new Producto(nombre, nombreProducto, nombre, cantidad, cantidad, cantidad, cantidad, precioBase, codigo)codigo, nombre, cantidad, precioBase, tipo);
        }
    }

    /**
     * Calcula la suma de las ganancias esperadas de todos los productos.
     * @return ganancia total esperada.
     */
    public double calcularGananciaTotal() {
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].calcularGananciaEsperada();
        }
        return total;
    }

    /**
     * Muestra en pantalla todos los productos agregados.
     */
    public void mostrarProductos() {
        StringBuilder texto = new StringBuilder();
        texto.append("Super: ").append(supermercado.getNombre())
             .append(" (").append(supermercado.getCodigo()).append(")\n");
        texto.append("Empleado: ").append(empleado.getNombre())
             .append(" - Cédula: ").append(empleado.getCedula()).append("\n\n");
        for (int i = 0; i < productos.length; i++) {
            texto.append("--- Producto ").append(i + 1).append(" ---\n");
            texto.append(productos[i].mostrarInformacion()).append("\n");
        }
        JTextArea area = new JTextArea(texto.toString());
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        scroll.setPreferredSize(new Dimension(420, 350));
        JOptionPane.showMessageDialog(null, scroll, "Productos agregados", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Muestra el monto total de ganancia esperada.
     */
    public void mostrarGananciaTotal() {
        JOptionPane.showMessageDialog(null,
                "Ganancia total esperada: " + String.format("%,.2f", calcularGananciaTotal()));
    }
}
