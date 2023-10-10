package test;

import java.util.Scanner;
import objetos.*;

public class MenuAgregar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la gestión de la universidad");
        System.out.println("Seleccione lo que desea agregar:");
        System.out.println("D - Docente");
        System.out.println("E - Estudiante");
        System.out.println("X - Empleado");

        String opcion = scanner.nextLine().toUpperCase();

        switch (opcion) {
            case "D":
                testDocente.agregarDocente(scanner);
                break;
            case "E":
                TestEstudiante.agregarEstudiante(scanner);
                break;
            case "X":
                TestEmpleado.agregarEmpleado(scanner);
                break;
            default:
                System.out.println("Opción no válida. Debe elegir D (Docente), E (Estudiante) o X (Empleado).");
                break;
        }

        scanner.close();
    }
}
