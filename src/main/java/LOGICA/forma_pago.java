
package LOGICA;


public class forma_pago {
    private int id;
    private Varchar Forma_pago;

    public forma_pago() {
    }

    public forma_pago(int id, Varchar Forma_pago) {
        this.id = id;
        this.Forma_pago = Forma_pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Varchar getForma_pago() {
        return Forma_pago;
    }

    public void setForma_pago(Varchar Forma_pago) {
        this.Forma_pago = Forma_pago;
    }
    
    
    
    
}
