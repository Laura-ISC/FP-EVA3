/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author laura
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val1 = 5, val2 = 10;
        //1. Si es necesito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2); //invocar el metodo
        System.out.println("Suma de 5 +  10 = " + resu);
        //2. No necesito guardar el valor, un solo uso
        System.out.println("Suma de 5 +  10 = " + sumarEnteros(val1, val2));
        //3. Solo necesito ejecutar el metodo, no intere el resultado
        sumarEnteros(val1, val2);
    }
    //METODO PARA SUMAR DPS ENTEROS
    //LLAMAR A SUS METODOS USANDO VERBOS Y ESCRITURA camelCase
    //1. Modificadores de acceso: public, protected, private, default
    //2. static --> PARA USAR LOS MÉTODOS DENTRO DEL MAIN
    //3. Valor de retorno: cualquier tipo de dato
    //   void --> si no quieren regresar un valor
    //4. Nombre del método: mismas reglas que identificadores
    //5. lista de parémetros: pueden ser cero o N cantidad
    //1      2     3        4               5
    public static int sumarEnteros(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
   
    
    
    
    
    
    
}
