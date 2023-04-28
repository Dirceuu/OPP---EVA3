/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_3_try.pkgcatch;

/**
 *
 * @author Alan
 */
public class EVA_3_3_TRYCATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5, y=0;
        try{//BLOQUE DE CÓDIGO QUE PUEDE GENERAR UNA EXECPTION:
        int resu = x/y;
        }catch(ArithmeticException e){//BLOQUE DE CODIGO QUE SOLUCIONA LA EXCPTION:
            System.out.println("Execption: "+e.getMessage());
        }
        System.out.println("Fin del programa");
        }
    }
    
