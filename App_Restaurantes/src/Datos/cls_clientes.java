package Datos;
/**@author Alejandra**/

public class cls_clientes {
    private String Id;
    private String Nombre;
    private String Contacto;
    private String Correo;
    private int Estado; // 0: Inactivo - 1: Activo
    
    public cls_clientes(String id, String n, String co, String corr){
        this.Id = id;
        this.Nombre = n;
        this.Contacto = co;
        this.Correo = corr;
        this.Estado = 0;
    }

    public int getEstado() {return this.Estado;}
    public void setEstado(int e) {this.Estado = e;}

    public String getId() {
        return Id;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getContacto() {
        return Contacto;
    }
    public String getCorreo() {
        return Correo;
    } 
}