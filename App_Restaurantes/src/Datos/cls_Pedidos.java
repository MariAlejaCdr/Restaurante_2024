package Datos;
/** @author Alejandra**/

public class cls_Pedidos {
    private String Id_cliente;
    private String detalles;
    private float total;

    public cls_Pedidos(String Id_cliente, String detalles, float total) {
        this.Id_cliente = Id_cliente;
        this.detalles = detalles;
        this.total = total;
    }
    
    public String getdetalle(){return this.detalles;}
    public String getIdcliente(){return this.Id_cliente;}
    public float getTotal(){return this.total;}
}
