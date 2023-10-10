package objetos;

import java.util.ArrayList;
import java.util.List;

public class CoordinadorCarrera extends Docente {
    private List<String> responsabilidades;

    public CoordinadorCarrera() {
        this.responsabilidades = new ArrayList<>();
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        if (responsabilidades != null) {
            this.responsabilidades = responsabilidades;
        } else {
            throw new IllegalArgumentException("La lista de responsabilidades no puede ser nula");
        }
    }

    // Puedes agregar métodos específicos de CoordinadorCarrera aquí.

    // Método para agregar una responsabilidad específica al coordinador
    public void agregarResponsabilidad(String responsabilidad) {
        if (responsabilidad != null && !responsabilidad.isEmpty()) {
            this.responsabilidades.add(responsabilidad);
        } else {
            throw new IllegalArgumentException("La responsabilidad no puede ser nula o vacía");
        }
    }

    // Método para eliminar una responsabilidad específica del coordinador
    public void eliminarResponsabilidad(String responsabilidad) {
        if (responsabilidad != null && !responsabilidad.isEmpty()) {
            this.responsabilidades.remove(responsabilidad);
        } else {
            throw new IllegalArgumentException("La responsabilidad no puede ser nula o vacía");
        }
    }
    
    // Otros métodos específicos de CoordinadorCarrera
}
