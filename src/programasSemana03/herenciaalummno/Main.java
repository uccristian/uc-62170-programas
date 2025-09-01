package programasSemana03.herenciaalummno;

import utils.ConsoleMenu;
import utils.InputReader;

public class Main {
    public static void main(String[] args) {
        
        String[] opciones = {"Alumno Instituto", "Alumno Universidad", "Salir"};
        ConsoleMenu menu = new ConsoleMenu(opciones);
        int opcion;
        
        do{
            menu.showMenu("MENU");
            opcion = menu.selectOption();
            
            switch(opcion)
            {
                case 1 -> {
                    int codigo = InputReader.readInt("Ingrese codigo", 1);
                    String nombre = InputReader.readString("Ingrese nombre");
                    String especialidad = InputReader.readString("Ingrese especialidad");
                    
                    AlumnoInstituto alumnoInstituto = new AlumnoInstituto(codigo, nombre, especialidad);
                    alumnoInstituto.consultar();
                }
                case 2 -> {
                    int codigo = InputReader.readInt("Ingrese codigo", 1);
                    String nombre = InputReader.readString("Ingrese nombre");
                    String facultad = InputReader.readString("Ingrese facultad");
                    
                    AlumnoUniversitario alumnoUniversitario = new AlumnoUniversitario(codigo, nombre, facultad);
                    alumnoUniversitario.consultar();
                }
                case 3 -> {
                    System.out.println("Gracias...!...Vuelva pronto");
                }
            }
            
        } while(opcion != opciones.length);
    }
}
