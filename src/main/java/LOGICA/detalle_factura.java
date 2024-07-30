

package LOGICA;

import java.math.BigDecimal;


public class detalle_factura {
    private int id;
    private int Item;
    private int IVA;
    private BigDecimal Valor_Total;
    private BigDecimal Valor_Unitario;
    private int Cantidad;
    private Varchar Descuento;
    private BigDecimal Total;
    private int Codigo_Producto;

    public detalle_factura() {
    }

    public detalle_factura(int id, int Item, int IVA, BigDecimal Valor_Total, BigDecimal Valor_Unitario, int Cantidad, Varchar Descuento, BigDecimal Total, int Codigo_Producto) {
        this.id = id;
        this.Item = Item;
        this.IVA = IVA;
        this.Valor_Total = Valor_Total;
        this.Valor_Unitario = Valor_Unitario;
        this.Cantidad = Cantidad;
        this.Descuento = Descuento;
        this.Total = Total;
        this.Codigo_Producto = Codigo_Producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int Item) {
        this.Item = Item;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public BigDecimal getValor_Total() {
        return Valor_Total;
    }

    public void setValor_Total(BigDecimal Valor_Total) {
        this.Valor_Total = Valor_Total;
    }

    public BigDecimal getValor_Unitario() {
        return Valor_Unitario;
    }

    public void setValor_Unitario(BigDecimal Valor_Unitario) {
        this.Valor_Unitario = Valor_Unitario;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Varchar getDescuento() {
        return Descuento;
    }

    public void setDescuento(Varchar Descuento) {
        this.Descuento = Descuento;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal Total) {
        this.Total = Total;
    }

    public int getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(int Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }
    
    
    
    
}
