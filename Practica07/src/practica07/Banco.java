package practica07;

import java.util.ArrayList;

public class Banco {
    protected String nombre;
    protected String direccion;
    private ArrayList <Cliente> clientes;
    
    public Banco(){
        clientes=new ArrayList();
    }
    
    public Banco(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    public void AgregarCliente(Cliente Ce){
        if (clientes==null) {
            clientes=new ArrayList();
        }
        clientes.add(Ce);
    }
    
    public int ObtenerNumClientes(){
        return clientes.size();
    }
    
    public Cliente ObtenerCliente(int index){
        return clientes.get(index);
    }
    
    public void AsignarDatosdelBanco(String n, String d){
        nombre=n;
        direccion=d;
    }
    
    public String ObtenerNombre(){
        return nombre;
    }
    
    public String ObtenerDireccion(){
        return direccion;
    }
}
