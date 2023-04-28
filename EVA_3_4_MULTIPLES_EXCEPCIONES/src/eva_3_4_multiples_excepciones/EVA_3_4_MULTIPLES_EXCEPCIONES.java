/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class EVA_3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        do{
        try{
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce los valores de x: ");
        x = input.nextInt();
        System.out.println("Introduce los valores de y: ");
        y = input.nextInt();
        int resu = x/y;
        System.out.println("La división de " + x + "/" + y+ "es: " + resu);
        break;
        }catch(InputMismatchException e){
            System.out.println("Vuela a intentarlo. "
                    + "Captura erronea de datos, ingrese los datos con numeros: "+ e.getMessage() + "\n" );
        }catch(ArithmeticException e){
            System.out.println("Vuelva a intentarlo. "
                    + "No se puede dividir entre 0: " + "\n" + e.getMessage());
        }
        }while(true);
        System.out.println("PROGRAMA TERMINO:");
   
    }
    }
