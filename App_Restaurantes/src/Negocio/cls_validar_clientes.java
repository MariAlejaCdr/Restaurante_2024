package Negocio;
/**@author Alejandra**/

public class cls_validar_clientes {
    private boolean val = false;
    private String msn;
    public void validarDatosEntrada(
    String id, String n, String co, String corr){
        if(id.equals("") || n.equals("") || co.equals("") || corr.equals("")){
            this.msn = "Debe ingresar todos los datos";
        }else{
            this.val = true;
            this.msn = "El cliente " + n + " ha sido registrado con exito.";
        }
    }
    
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.val;}
}
