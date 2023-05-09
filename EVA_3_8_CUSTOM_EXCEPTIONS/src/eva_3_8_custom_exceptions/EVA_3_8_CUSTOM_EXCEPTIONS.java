/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_3_8_custom_exceptions;

/**
 *
 * @author Alan
 */
public class EVA_3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona perso = new Persona();
        perso.setNombre("Dirceu");
        perso.setApellido("Rivs");
        try {
            perso.setEdad(-19);
        } catch (DatosEntradaCheckedEx e) {
            System.out.println(e.getMessage());

        }

    }
}


class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {

        this.nombre = "";
        this.apellido = "";
        this.edad = 0;

    }

    public Persona(String nombre, String apellido, int edad) throws DatosEntradaCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatosEntradaCheckedEx {
        if (edad < 0) 
            throw new DatosEntradaCheckedEx();
        this.edad = edad;
    }

}


class DatosEntradaException extends RuntimeException {

    public DatosEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo ");
    }

}

class DatosEntradaCheckedEx extends Exception{
    
    public DatosEntradaCheckedEx(){
      super("Dato de entrada incorrecto!! El valor debe ser positivo ");
              }
    
}
