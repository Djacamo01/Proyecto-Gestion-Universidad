package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import objetos.*;

public class testPersona {
    static void ingresarInformacionBasica(Scanner scanner, persona persona) {
        System.out.println("Ingrese el nombre:");
        persona.setNombre(scanner.nextLine());

        System.out.println("Ingrese el apellido:");
        persona.setApellido(scanner.nextLine());

        System.out.println("Ingrese el sexo (M/F):");
        persona.setSexo(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD):");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            persona.setFecNac(dateFormat.parse(scanner.nextLine()));
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Use el formato YYYY-MM-DD.");
            System.exit(1);
        }

        System.out.println("Ingrese la cédula:");
        persona.setCedula(scanner.nextLine());

        System.out.println("Ingrese la dirección:");
        persona.setDireccion(scanner.nextLine());

        System.out.println("Ingrese el número de teléfono:");
        persona.setTelefono(scanner.nextLine());
    }

    static void imprimirDetallesPersona(persona persona) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Detalles de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Fecha de Nacimiento: " + dateFormat.format(persona.getFecNac()));
        System.out.println("Cédula: " + persona.getCedula());
        System.out.println("Dirección: " + persona.getDireccion());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
