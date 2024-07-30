
package LOGICA;


public class proveedor {
    private int Id;
    private String Nombre;
    private String Apellido;
    private int Documento;
    private int Telefono;
    private String Direccion;
    private String Producto;

    public proveedor() {
    }

    public proveedor(int Id, String Nombre, String Apellido, int Documento, int Telefono, String Direccion, String Producto) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Producto = Producto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    
    
}
