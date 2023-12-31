package test;

import java.util.Scanner;
import objetos.Estudiante;

public class TestEstudiante extends testPersona {
    public static void agregarEstudiante(Scanner scanner) {
        Estudiante estudiante = new Estudiante();
        ingresarInformacionBasica(scanner, estudiante);

        System.out.println("Ingrese el carné del estudiante:");
        estudiante.setCarnet(scanner.nextLine());

        System.out.println("Ingrese la carrera del estudiante:");
        estudiante.setCarrera(scanner.nextLine());

        System.out.println("Ingrese la facultad del estudiante:");
        estudiante.setFacultad(scanner.nextLine());

        System.out.println("Ingrese el semestre del estudiante:");
        estudiante.setSemestre(scanner.nextLine());

        System.out.println("Ingrese la materia del estudiante:");
        estudiante.setMateria(scanner.nextLine());

        System.out.println("Ingrese la sección del estudiante:");
        estudiante.setSeccion(scanner.nextLine());

        System.out.println("Ingrese el profesor del estudiante:");
        estudiante.setProfesor(scanner.nextLine());

        // Puedes continuar solicitando otros atributos específicos de Estudiante aquí.

        imprimirDetallesPersona(estudiante);

        System.out.println("Carnet: " + estudiante.getCarnet());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Facultad: " + estudiante.getFacultad());
        System.out.println("Semestre: " + estudiante.getSemestre());
        System.out.println("Materia: " + estudiante.getMateria());
        System.out.println("Seccion: " + estudiante.getSeccion());
        System.out.println("Profesor: " + estudiante.getProfesor());
        
        
    }
}
