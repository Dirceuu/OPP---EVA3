/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_2_exeption_propagation;

/**
 *
 * @author Alan
 */
public class EVA_3_2_EXEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA MAIN");
        A();
        System.out.println(" TERMINA MAIN");
    }
    
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
        
    }
    public static void B(){
        System.out.println("INICIA B");
        C();
        System.out.println("TERMINA B");
        
        
    }
    public static void C(){
        System.out.println("INICIA C");
        int x=5;
        int y=0;
        int resu = x/y;
        System.out.println("RESULTADO " + resu);
        System.out.println("TERMINA C");
        System.out.println("TERMINA EL PROGRAMA");        
        
    }
}