
package LOGICA;

import java.math.BigDecimal;
import java.util.Date;


public class cabecera_factura {
    private int id;
    private BigDecimal Total_pago;
    private int Vendedor_id;
    private int Cleinte_id;
    private Date Fecha_Pago;

    public cabecera_factura() {
    }

    public cabecera_factura(int id, BigDecimal Total_pago, int Vendedor_id, int Cleinte_id, Date Fecha_Pago) {
        this.id = id;
        this.Total_pago = Total_pago;
        this.Vendedor_id = Vendedor_id;
        this.Cleinte_id = Cleinte_id;
        this.Fecha_Pago = Fecha_Pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getTotal_pago() {
        return Total_pago;
    }

    public void setTotal_pago(BigDecimal Total_pago) {
        this.Total_pago = Total_pago;
    }

    public int getVendedor_id() {
        return Vendedor_id;
    }

    public void setVendedor_id(int Vendedor_id) {
        this.Vendedor_id = Vendedor_id;
    }

    public int getCleinte_id() {
        return Cleinte_id;
    }

    public void setCleinte_id(int Cleinte_id) {
        this.Cleinte_id = Cleinte_id;
    }

    public Date getFecha_Pago() {
        return Fecha_Pago;
    }

    public void setFecha_Pago(Date Fecha_Pago) {
        this.Fecha_Pago = Fecha_Pago;
    }
    
    
    
    
}
