/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioevaluado;

/**
 *
 * @author sebas
 */
public class Productos {
    public String nombreSuper;
    public String[] nombreProducto;
    public String nombreEmpleado;
    public int cantidadProductos;
    public int cedulaEmpleado;
    public int codigoSuper;
    public int codigoProducto;
    public double precioBase;
    private double precioButro;
    

    public Productos(String nombreSuper, String[] nombreProducto, String nombreEmpleado, int cantidadProductos, int cedulaEmpleado, int codigoSuper, int codigoProducto, double precioBase, String clasificacion) {
        this.nombreSuper = nombreSuper;
        this.nombreProducto = nombreProducto;
        this.nombreEmpleado = nombreEmpleado;
        this.cantidadProductos = cantidadProductos;
        this.cedulaEmpleado = cedulaEmpleado;
        this.codigoSuper = codigoSuper;
        this.codigoProducto = codigoProducto;
        this.precioBase = precioBase;
        
    }
    public double calcularGananciaEsperada() {
        return (precioButro - precioBase) * cantidadProductos;
    }
    
    
    
    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String[] getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String[] nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public int getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(int codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombreSuper=" + nombreSuper + ", nombreProducto=" + nombreProducto + ", nombreEmpleado=" + nombreEmpleado + ", cantidadProductos=" + cantidadProductos + ", cedulaEmpleado=" + cedulaEmpleado + ", codigoSuper=" + codigoSuper + ", codigoProducto=" + codigoProducto + ", precioBase=" + precioBase + '}';
    }

   

    

    

    
}
