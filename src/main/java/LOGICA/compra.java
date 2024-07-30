

package LOGICA;

import java.math.BigDecimal;
import java.util.Date;


public class compra {
    private int id;
    private int cantidad;
    private Date Fecha_Pago;
    private BigDecimal precio_unitario;
    private int Total_compra;
    private int Forma_pago;

    public compra() {
    }

    public compra(int id, int cantidad, Date Fecha_Pago, BigDecimal precio_unitario, int Total_compra, int Forma_pago) {
        this.id = id;
        this.cantidad = cantidad;
        this.Fecha_Pago = Fecha_Pago;
        this.precio_unitario = precio_unitario;
        this.Total_compra = Total_compra;
        this.Forma_pago = Forma_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }

    public BigDecimal getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(BigDecimal precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getTotal_compra() {
        return Total_compra;
    }

    public void setTotal_compra(int Total_compra) {
        this.Total_compra = Total_compra;
    }

    public int getForma_pago() {
        return Forma_pago;
    }

    public void setForma_pago(int Forma_pago) {
        this.Forma_pago = Forma_pago;
    }
    
    
    
    
    
    
    
}
