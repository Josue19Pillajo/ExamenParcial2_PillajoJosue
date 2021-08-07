
package test;

import dominio.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class TestPersonaJubilada {

static Scanner entrada;

 public static void main(String[] args) {
    ArrayList<Jubilado> Jubilado = new ArrayList<>();
        int op = 0;
        int op1 = 0;
        double porDiscapacidad = 0;
String Nombre;
String nroCedula;
        double salarioBase = 0;
        int aniosAporte = 0;
        double total = 0;
String tipoJubilacion = null;
        entrada = new Scanner(System.in);
        while (op != 6) {
            op = 0;
            salarioBase = 0;
            aniosAporte = 0;
            porDiscapacidad = 0;
System.out.println("");
System.out.println("Ojo: Para terminar ingrese salir en el nombre");
System.out.println("");
System.out.print("Nombre: ");
            Nombre = entrada.nextLine();
            if (Nombre.equals("salir")) {
System.out.println("");
System.out.println("Terminado");
System.out.println("");
          op = 6;
            break;
}
else
{
System.out.print("Cedula: ");
nroCedula = entrada.nextLine();
System.out.print("Ingrese su salario base: ");
                while (salarioBase <= 0) {
                    salarioBase = entrada.nextDouble();
}
System.out.print("Ingrese los años de aporte al seguro: ");
                while (aniosAporte <= 0) {
                aniosAporte = entrada.nextInt();
}
Jubilado pj = new Jubilado(nroCedula, Nombre, salarioBase, aniosAporte);
double pi = pj.calculoPensionInicial(aniosAporte);

System.out.println("");
System.out.println(" Menu de opciones de jubilacion ");
System.out.println("1.- Jubilacion por vejez");
System.out.println("2.- Jubilacion por discapacidad");
System.out.println("3.- Jubilacion Patronal");
System.out.print("Ingrese el numero de la opcion que desea: ");
    while (op < 1 || op > 3) {
         op = entrada.nextInt();
}
       entrada.nextLine();
                switch (op) 
{
case 1 ->
{
tipoJubilacion = "Jubilacion por vejez";
JubilaciónporVejez jv = new JubilaciónporVejez();
total = jv.CalculoDineroV(pi, salarioBase);

}
case 2 ->
{
tipoJubilacion = "Jubilacion por discapacidad";
    System.out.println("");
    System.out.println("--- Jubilacion por discapacidad ---");
    JubilaciónporDiscapacidad jd = new JubilaciónporDiscapacidad();
  System.out.print("Su porcentaje de discapacidad es: ");
   while (porDiscapacidad < 1 || porDiscapacidad > 100) {
         porDiscapacidad = entrada.nextInt();
}
     total = jd.CalculoDineroD(pi, salarioBase, porDiscapacidad);
      entrada.nextLine();
}
case 3 ->
{
 op1 = 0;

JubilaciónPatronal jp = new JubilaciónPatronal();
System.out.println("");
System.out.println("--- Menu de opciones de jubilacion Patronal ---");
System.out.println("1.- Empresa Privada");
System.out.println("2.- Emresa Publica");
System.out.print("Ingrese el numero de la opcion que desea: ");
    while (op1 < 1 || op1 > 2) {
 op1 = entrada.nextInt();
}
entrada.nextLine();
switch (op1) {
                            
case 1 -> {
tipoJubilacion = "jubilacion Patronal: Privada";
System.out.println("");
System.out.println("Jubilacion Patronal: Empresa Privada ");

}
case 2 ->
{
tipoJubilacion = "jubilacion Patronal: Publica";
System.out.println("");
System.out.println("--- Jubilacion Patronal: Empresa Publica ---");
}
}
total = jp.CalculoDineroP(pi, salarioBase, op1);

}
}
System.out.println("");
System.out.println("La pension total de " + pj.getNombre() + " es: " + total);
System.out.println("");
System.out.println(" Lista de Personas Ingresadas ");
    Jubilado.add(new Jubilado(nroCedula, Nombre, total, tipoJubilacion));
    Iterator itper;
   itper = Jubilado.iterator();
imprimir(itper);
}
        }
                  }

public static void imprimir(Iterator it) {
   while (it.hasNext()) {
System.out.println(it.next());
}
    } }