package test;

import java.util.Scanner;
import objetos.Empleado;

public class TestEmpleado extends testPersona {
    public static void agregarEmpleado(Scanner scanner) {
        Empleado empleado = new Empleado();
        ingresarInformacionBasica(scanner, empleado);

        System.out.println("Ingrese el código INSS del empleado:");
        empleado.setCodINSS(scanner.nextLine());

        System.out.println("Ingrese la facultad del empleado:");
        empleado.setFacultad(scanner.nextLine());

        System.out.println("Ingrese el salario del empleado:");
        try {
            double salario = Double.parseDouble(scanner.nextLine());
            empleado.setSalario(salario);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Ingrese un salario válido.");
            return;
        }

        System.out.println("Ingrese la bonificación del empleado:");
        try {
            double bonificacion = Double.parseDouble(scanner.nextLine());
            empleado.setBonificacion(bonificacion);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Ingrese una bonificación válida.");
            return;
        }

        // Puedes continuar solicitando otros atributos específicos de Empleado aquí.

        imprimirDetallesPersona(empleado);

        System.out.println("Codigo INSS: " + empleado.getCodINSS());
        System.out.println("Facultad Asiganada: " + empleado.getFacultad());
        System.out.println("Salario Estipulado: "+empleado.getSalario());
        System.out.println("Su Bonificacion:"+empleado.getBonificacion());

    }
}
