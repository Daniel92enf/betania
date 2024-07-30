
package LOGICA;

import java.math.BigDecimal;


public class producto {
    private String Nombre;
    private String Descripcion;
    private BigDecimal precio;
    private Varchar stock;
    private int Detalle_Factura;
    private int Categoria;
    private int Forma_pago;

    public producto() {
    }

    public producto(String Nombre, String Descripcion, BigDecimal precio, Varchar stock, int Detalle_Factura, int Categoria, int Forma_pago) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.stock = stock;
        this.Detalle_Factura = Detalle_Factura;
        this.Categoria = Categoria;
        this.Forma_pago = Forma_pago;
        
      
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Varchar getStock() {
        return stock;
    }

    public void setStock(Varchar stock) {
        this.stock = stock;
    }

    public int getDetalle_Factura() {
        return Detalle_Factura;
    }

    public void setDetalle_Factura(int Detalle_Factura) {
        this.Detalle_Factura = Detalle_Factura;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int Categoria) {
        this.Categoria = Categoria;
    }

    public int getForma_pago() {
        return Forma_pago;
    }

    public void setForma_pago(int Forma_pago) {
        this.Forma_pago = Forma_pago;
    }
    
    
    
    
    
    
   
    
}
