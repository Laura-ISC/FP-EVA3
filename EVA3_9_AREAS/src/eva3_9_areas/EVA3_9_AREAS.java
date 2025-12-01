/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        imprimirMenu();
        //System.out.println("¿Que desea calcular? ");
        opcion = captu.nextInt();
        switch (opcion) {
            case 1:
                double radio;
                System.out.println("Cual es el radio? ");
                radio = captu.nextDouble();
                System.out.println("El circulo de radio " + radio + " tiene un area de: " + calcularAreaC(radio));
                break;
            case 2:
                datosUsuario();
                break;
            case 3:
                double base, altura, base2;
                System.out.println("Cual es la base: ");
                base = captu.nextDouble();
                System.out.println("Cual es la base 2: ");
                base2 = captu.nextDouble();
                System.out.println("Cual es la altura: ");
                altura = captu.nextDouble();
                System.out.println("El area del trapecio es: " + calcularAreaT (base, altura, base2));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
            
  
    }
    public static void datosUsuario(){
        Scanner captu = new Scanner(System.in);
        double base, altura;
        System.out.println("Medida de la base: ");
        base = captu.nextDouble();
        System.out.println("Medida de la altura: ");
        altura = captu.nextDouble();
        System.out.println("El triangulo de base " + base + " y altura " + altura + " = " + calcularAreaR(base, altura));
    }
    public static double calcularAreaR(double base, double altura){
        double resu1 = 1;
        resu1 = base * altura;
        
        return resu1;
    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular area de un circulo");
        System.out.println("2. Calcular area de un rectangulo");
        System.out.println("3. Calcular area de un trapecio");
        System.out.println("SELECCIONE UNA OPCION:");
    }
    
    public static double calcularAreaC(double radio){
        Scanner captu = new Scanner(System.in);
        double resu = 1;
        resu = (int) (Math.PI * radio * radio);
        return resu;
    }
    public static double calcularAreaT(double base, double altura, double base2){  
    double resu = 1;
    resu= (base + base2)*altura;
        return resu/2;
    }

    }



