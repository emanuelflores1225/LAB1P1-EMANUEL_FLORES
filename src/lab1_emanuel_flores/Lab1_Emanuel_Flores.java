package lab1_emanuel_flores;
import java.util.Scanner;

public class Lab1_Emanuel_Flores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese su nombre: "); //Ingresa nombre de usuario
        String nombre = entrada.nextLine();
        
        //Se ingresan las notas de 4 clases
        System.out.print("Ingrese las notas de la primera clase: ");
        double primeraClase = entrada.nextDouble(); 
        
        System.out.print("Ingrese las notas de la segunda clase: ");
        double segundaClase = entrada.nextDouble(); 
        
        System.out.print("Ingrese las notas de la tercera clase: ");
        double terceraClase = entrada.nextDouble(); 
        
        System.out.print("Ingrese las notas de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble(); 
        
        //calculo de promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase/4 ; 
        
        //imprimir promedio
        System.out.println("----- " + nombre + " el promedio de sus clases es: " + promedio);
    }
    
}
