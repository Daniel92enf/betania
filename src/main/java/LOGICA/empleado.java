
package LOGICA;

import java.util.Date;


public class empleado {
    private int id;
     private String Nombre;
    private String Apellido;
    private int Documento;
    private int Telefono;
    private String Direccion;
    private String Cargo;
    private int salario;
    private  Date Fecha_Contrato;

    public empleado() {
    }

    public empleado(int id, String Nombre, String Apellido, int Documento, int Telefono, String Direccion, String Cargo, int salario, Date Fecha_Contrato) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Cargo = Cargo;
        this.salario = salario;
        this.Fecha_Contrato = Fecha_Contrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getFecha_Contrato() {
        return Fecha_Contrato;
    }

    public void setFecha_Contrato(Date Fecha_Contrato) {
        this.Fecha_Contrato = Fecha_Contrato;
    }
    
    
    
    
}
