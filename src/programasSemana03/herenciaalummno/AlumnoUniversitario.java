/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasSemana03.herenciaalummno;

/**
 *
 * @author estudiantehyo
 */
public class AlumnoUniversitario extends Alumno {
    private final String facultad;
    
    public AlumnoUniversitario(int codigo, String nombre, String facultad) {
        super(codigo, nombre);
        this.facultad = facultad;
    }
    
    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Facultad: " + facultad + "\n");
    }
}
