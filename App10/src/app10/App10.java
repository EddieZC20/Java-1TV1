package app10;

import java.util.ArrayList;

public class App10 {

    public static void main(String[] args) {
        ArrayList <Imprimible> Archivos;
        Archivos=new ArrayList();
        Imagen I1;
        Texto Doc1;
        I1=new Imagen();
        Doc1=new Texto();
        Archivos.add(I1);
        Archivos.add(Doc1);
        
        Doc1.Imprimir();
        I1.Imprimir();
    }
}
