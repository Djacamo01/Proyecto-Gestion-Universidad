package test;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import objetos.*;

public class tesFuncionalidad {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la gestión de la universidad");
        System.out.println("¿Qué desea agregar, Docente o Estudiante?");

        String opcion = scanner.nextLine();

        if (opcion.equalsIgnoreCase("Docente")) {
            agregarDocente(scanner);
        } else if (opcion.equalsIgnoreCase("Estudiante")) {
            agregarEstudiante(scanner);
        } else {
            System.out.println("Opción no válida. Debe elegir entre 'Docente' o 'Estudiante'.");
        }

        scanner.close();
    }

    public static void agregarDocente(Scanner scanner) {
        Docente docente = new Docente();
        
        System.out.println("Ingrese el nombre del docente:");
        docente.setNombre(scanner.nextLine());

        System.out.println("Ingrese el apellido del docente:");
        docente.setApellido(scanner.nextLine());

        System.out.println("Ingrese el sexo del docente (M/F):");
        docente.setSexo(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento del docente (YYYY-MM-DD):");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            docente.setFecNac(dateFormat.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Use el formato YYYY-MM-DD.");
            return;
        }

        System.out.println("Ingrese la cédula del docente:");
        docente.setCedula(scanner.nextLine());

        System.out.println("Ingrese la dirección del docente:");
        docente.setDireccion(scanner.nextLine());

        System.out.println("Ingrese el número de teléfono del docente:");
        docente.setTelefono(scanner.nextLine());

        System.out.println("Ingrese las horas semanales máximas del docente:");
        try {
            int horasSemanales = Integer.parseInt(scanner.nextLine());
            docente.setHorasSemanalesMaximas(horasSemanales);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Ingrese un número de horas semanales válido.");
            return;
        }

        // Aquí puedes seguir solicitando otros atributos específicos de Docente y realizar las validaciones necesarias.

        // Mostrar los detalles del docente
        System.out.println("Detalles del Docente:");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Apellido: " + docente.getApellido());
        System.out.println("Sexo: " + docente.getSexo());
        System.out.println("Fecha de Nacimiento: " + dateFormat.format(docente.getFecNac()));
        System.out.println("Cédula: " + docente.getCedula());
        System.out.println("Dirección: " + docente.getDireccion());
        System.out.println("Teléfono: " + docente.getTelefono());
        System.out.println("Horas Semanales Máximas: " + docente.getHorasSemanalesMaximas());

        // Puedes continuar mostrando otros atributos específicos de Docente aquí.
    }

    public static void agregarEstudiante(Scanner scanner) {
        Estudiante estudiante = new Estudiante();
        
        System.out.println("Ingrese el nombre del estudiante:");
        estudiante.setNombre(scanner.nextLine());

        System.out.println("Ingrese el apellido del estudiante:");
        estudiante.setApellido(scanner.nextLine());

        System.out.println("Ingrese el sexo del estudiante (M/F):");
        estudiante.setSexo(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento del estudiante (YYYY-MM-DD):");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            estudiante.setFecNac(dateFormat.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Use el formato YYYY-MM-DD.");
            return;
        }

        System.out.println("Ingrese la cédula del estudiante:");
        estudiante.setCedula(scanner.nextLine());

        System.out.println("Ingrese la dirección del estudiante:");
        estudiante.setDireccion(scanner.nextLine());

        System.out.println("Ingrese el número de teléfono del estudiante:");
        estudiante.setTelefono(scanner.nextLine());

        System.out.println("Ingrese el carné del estudiante:");
        estudiante.setCarnet(scanner.nextLine());

        System.out.println("Ingrese la carrera del estudiante:");
        estudiante.setCarrera(scanner.nextLine());

        // Aquí puedes seguir solicitando otros atributos específicos de Estudiante y realizar las validaciones necesarias.

        // Mostrar los detalles del estudiante
        System.out.println("Detalles del Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Sexo: " + estudiante.getSexo());
        System.out.println("Fecha de Nacimiento: " + dateFormat.format(estudiante.getFecNac()));
        System.out.println("Cédula: " + estudiante.getCedula());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Teléfono: " + estudiante.getTelefono());
        System.out.println("Carné: " + estudiante.getCarnet());
        System.out.println("Carrera: " + estudiante.getCarrera());

        // Puedes continuar mostrando otros atributos específicos de Estudiante aquí.
    }

}
