package eva_3_1_uncheked_exeptions;

import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class EVA_3_1_UNCHEKED_EXEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SON TODAS
    //ARITHMETRIC EXEPTION:
    //DIVISIÓN ENTRE O
    System.out.println("INICIANDO EL PROGRAMA");
    int x=5, y =0;
    System.out.println("INICIANDO LAS VARIABLES");
    int resu = x/y;
        System.out.println("Calculando la división");
        System.out.println("División " + resu);
    
    
    //INPUTMITSMATCH EXEPTION: EROOR AL CAPTURAR DATOS.
    Scanner input = new Scanner(System.in);
    System.out.println("Introduce un numero:");
    int nume = input.nextInt();
        System.out.println("Tu numero es : "+nume);
    
    //INDEXOUTOFBONUS EXECPTION
    int [] arreglo = new int[5]; //0- (n-1)
    arreglo[0] = 100;
    arreglo[1] = 200;
    arreglo[2] = 300;
    arreglo[3] = 400;
    arreglo[4] = 500;
    arreglo[5] = 600;//ERROR DE LOGICA: 5 NO ES UNA POSICIÓN VALIDA.
    
    //NULLPOINTER EXEPTION:
    uwu objuwu = null;
        System.out.println("valor de u = "´ + objuwu.u);
    
    
    
    
            

    }
    
}

class uwu{
    public int u=100;
}