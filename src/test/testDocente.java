package test;

import java.util.Scanner;
import objetos.*;

public class testDocente extends TestEmpleado {
    public static void agregarDocente(Scanner scanner) {
        Docente docente = new Docente();
        ingresarInformacionBasica(scanner, docente);

        System.out.println("Ingrese las horas semanales máximas del docente:");
        try {
            int horasSemanales = Integer.parseInt(scanner.nextLine());
            docente.setHorasSemanalesMaximas(horasSemanales);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Ingrese un número de horas semanales válido.");
            return;
        }

        // Puedes continuar solicitando otros atributos específicos de Docente aquí.

        imprimirDetallesPersona(docente);
    }
}
