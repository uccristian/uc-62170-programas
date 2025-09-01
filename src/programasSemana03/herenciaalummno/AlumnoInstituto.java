/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasSemana03.herenciaalummno;

/**
 *
 * @author estudiantehyo
 */
public class AlumnoInstituto extends Alumno {
    private final String especialidad;
    
    public AlumnoInstituto(int codigo, String nombre, String especialidad) {
        super(codigo, nombre);
        this.especialidad = especialidad;
    }
    
    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Especialidad: " + especialidad + "\n");
    }
}
