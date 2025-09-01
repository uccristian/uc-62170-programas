/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasSemana03.herenciaalummno;

/**
 *
 * @author estudiantehyo
 */
public class Alumno {
    private final int codigo;
    private final String nombre;
    
    public Alumno(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void consultar() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
    }
}
