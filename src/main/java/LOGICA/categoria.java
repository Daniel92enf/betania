
package LOGICA;


public class categoria {
    private int Id;
    private String Nombre;
    private Varchar Tipo;

    public categoria() {
    }

    public categoria(int Id, String Nombre, Varchar Tipo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
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

    public Varchar getTipo() {
        return Tipo;
    }

    public void setTipo(Varchar Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
}
