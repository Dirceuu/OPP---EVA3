/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alan
 */
public class EVA_3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //SIRVE COMO MEDIDA DE CONTROL 
        Prueba obj = new Prueba();
        try {
            obj.capturaMayoeCero(100);
            Scanner input = new Scanner (System.in);
            int valor = input.nextInt();
            //Checked:Forzoso atenderlas
            //Unchecked: error de logica que no es forzoso resolverlo
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        //CAPTURAR EXCEPCION;
        try{
        obj.division(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
                
                
    }
    
}

class Prueba{//EXCEPTION ES CHECKED EXCEPTION, ESTAMOS OBLIGADOS A ATENDER
    public void capturaMayoeCero(int valor) throws Exception{
        if(valor <= 0) //voy a generar una excepción.
            throw new Exception(valor + " Es negativo corrigelo");
            System.out.println("El valor es: " + valor);
        
    }
    
    public int division(int x, int y) throws ArithmeticException{
        if(y==0)
            throw new ArithmeticException("El valor del divisor es cero ");
        return x/y;
    
    }
}

