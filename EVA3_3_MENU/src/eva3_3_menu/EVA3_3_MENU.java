/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in); 
        int opcion;
        do{
            imprimirMenu();
            opcion = captu.nextInt();
            if(opcion == 1){
                calcularPotencia();
            }else if (opcion == 2){
               calcularSuma();
            }else if (opcion == 3){ 
                System.out.println("Saliendo del sistema....");
            }
        }while(opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("SELECCIONE UNA OPCION:");
    }
    
    public static void calcularPotencia(){
        Scanner captu = new Scanner(System.in);
        int base, exp;
        System.out.println("******* CALCULO DE UNA POTENCIA *******");
        System.out.println("Captura la base: ");
        base = captu.nextInt();
        System.out.println("Captura el exponente: ");
        exp = captu.nextInt();
        System.out.println(base + " elevado a " + exp + " - " + calcularPot(base, exp));
    }
    public static int calcularPot(int base, int expo){
        int resu= 1;
        for(int i = 1; i <= expo; i++){
            resu = resu * base;
        }
        return resu;
    }
    
    public static void calcularSuma(){
    Scanner capt = new Scanner (System.in);
    int num1, num2, resultado;
    System.out.println("Calcular suma");
    System.out.println("Primer numero: ");
    num1=capt.nextInt();
    System.out.println("Segundo numero: ");
    num2=capt.nextInt();
    System.out.println(num1+" + "+num2+" = "+calcularSuma(num1,num2));

    }
    public static int calcularSuma(int num1, int num2){  
    int resu;
    resu = num2 + num1;
        return resu;
}
}