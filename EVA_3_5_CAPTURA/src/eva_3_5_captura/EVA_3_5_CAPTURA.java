/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class EVA_3_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y ;
        do{
            try{
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor (entero) de x: ");
            x=input.nextInt();
            break;
            }catch(InputMismatchException e){
                System.out.println("No se introdujo un número válido, vuelve a intentar: ");
            
            }
        
        }while(true);
        System.out.println("Valor de x = " + x);


    }

}
