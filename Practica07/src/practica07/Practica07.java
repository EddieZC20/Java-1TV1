package practica07;

import java.util.Scanner;

public class Practica07 {
  
    public static void main(String[] args) {
int opc;
Banco Principal;
Principal=new Banco();
Principal.AsignarDatosdelBanco("Banco UPIITA", "Avenida Instituto Politécnico Nacional");
do{
System.out.println("Aplicación de Banco");
System.out.println("1. Agregar Cliente");
System.out.println("2. Seleccionar Cliente");
System.out.println("3. Listar Clientes");
System.out.println("9. Salir");
opc=Seleccion();
switch(opc){
case 1:AgregarCliente(Principal);break;
case 2:SeleccionarCliente(Principal);break;
case 3:ListarClientes(Principal);break;
}
}while (opc!=9);
}
public static void AgregarCliente(Banco B){
String Nombre;
int Edad;
System.out.println("Ingrese nombre del cliente:");
Nombre=Informacion();
System.out.println("Ingrese edad del cliente:");
Edad=Seleccion();
Cliente C;

C=new Cliente();
C.AsignarNombre(Nombre);
C.AsignarEdad(Edad);
B.AgregarCliente(C);
}
public static void SeleccionarCliente(Banco B){
int opc;
Cliente Aux;
if (B.ObtenerNumClientes()==0)
System.out.println("No hay clientes registrados");
else{
ListarClientes(B);
System.out.println("Ingrese el número de cliente:");
opc=Seleccion();
Aux=B.ObtenerCliente(opc);
if (Aux!=null)
OperacionCliente(Aux);
else
System.out.println("Numero de cliente no válido");
}
}
public static void ListarClientes(Banco B){
int Tam,i;
Tam=B.ObtenerNumClientes();
if (Tam==0)
System.out.println("NO hay clientes registrados");
else{
System.out.println("Clientes Registrados");
for(i=0;i<Tam;i++){
Cliente Aux;
Aux=B.ObtenerCliente(i);
System.out.println(i+" "+Aux.ObtenerNombre()+" "+Aux.ObtenerEdad());
}
}
}
public static void OperacionCliente(Cliente C){
int opc;
do{
System.out.println("1. Agregar cuenta");
System.out.println("2. Seleccionar cuenta");
System.out.println("3. Listar cuentas");
System.out.println("9. Salir");
opc=Seleccion();
switch (opc){
case 1:AgregarCuenta(C);break;
case 2:SeleccionarCuenta(C);break;
case 3:ListarCuentas(C);break;
}
}while(opc!=9);
}
public static void AgregarCuenta(Cliente C){
Cuenta Aux;
Aux=new Cuenta();
System.out.println("Ingrese el número de cuenta:");
Aux.AsignarNumCuenta(Seleccion());
C.AgregarCuenta(Aux);

}
public static void SeleccionarCuenta(Cliente C){
int opc;
Cuenta Aux;
if (C.ObtenerNumCuentas()==0)
System.out.println("El cliente no tiene cuentas asignadas");
else{
ListarCuentas(C);
System.out.println("Seleccione el indice de la cuenta:");
opc=Seleccion();
Aux=C.ObtenerCuenta(opc);
if (Aux!=null)
OperacionCuenta(Aux);
else
System.out.println("Numero de cuenta no válido");
}
}
public static void ListarCuentas(Cliente C){
int Tam,i;
Tam=C.ObtenerNumCuentas();
System.out.println("Cuentas registradas");
for(i=0;i<Tam;i++){
Cuenta Aux;
Aux=C.ObtenerCuenta(i);
System.out.println(i+":"+Aux.ObtenerNumCuenta()+"Saldo:"+Aux.ObtenerSaldo());
}
}
public static void OperacionCuenta(Cuenta C){
int opc;
System.out.println("1. Abonar Dinero");
System.out.println("2. Retirar Dinero");
System.out.println("3. Obtener Saldo");
opc=Seleccion();
switch (opc){
case 1:AbonarenCuenta(C);break;
case 2:RetirarDinero(C);break;
case 3:ObtenerSaldo(C);break;
}
}
public static void AbonarenCuenta(Cuenta C){
double Dinero;
Scanner Cantidad;
Cantidad=new Scanner(System.in);
System.out.println("Ingrese la cantida a abonar:");
Dinero=Cantidad.nextDouble();
if (C.AbonarDinero(Dinero))
System.out.println("Transaccion realizada");
else
System.out.println("No se realizo la transaccion");
}
public static void RetirarDinero(Cuenta C){
double Dinero;
Scanner Cantidad;
Cantidad=new Scanner(System.in);
System.out.println("Ingrese la cantida a retirar:");
Dinero=Cantidad.nextDouble();
if (C.RetirarDinero(Dinero))

System.out.println("Transaccion realizada");
else
System.out.println("No se realizo la transaccion");
}
public static void ObtenerSaldo(Cuenta C){
System.out.println("El saldo actual es:"+C.ObtenerSaldo());
}
public static int Seleccion(){
Scanner Teclado;
Teclado=new Scanner(System.in);
return Teclado.nextInt();
}
public static String Informacion(){
Scanner Teclado;
Teclado=new Scanner(System.in);
return Teclado.nextLine();
}
}


