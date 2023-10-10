package objetos;

public class Estudiante extends persona {

    private String carnet;
    private String carrera;
    private String facultad;
    private String semestre;
    private String materia;
    private String seccion;
    private String profesor;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        if (carnet != null && !carnet.isEmpty()) {
            this.carnet = carnet;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El carnet no puede ser nulo o vacío");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera != null && !carrera.isEmpty()) {
            this.carrera = carrera;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La carrera no puede ser nula o vacía");
        }
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        if (facultad != null && !facultad.isEmpty()) {
            this.facultad = facultad;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La facultad no puede ser nula o vacía");
        }
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        if (semestre != null && !semestre.isEmpty()) {
            this.semestre = semestre;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El semestre no puede ser nulo o vacío");
        }
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        if (materia != null && !materia.isEmpty()) {
            this.materia = materia;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La materia no puede ser nula o vacía");
        }
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        if (seccion != null && !seccion.isEmpty()) {
            this.seccion = seccion;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La sección no puede ser nula o vacía");
        }
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        if (profesor != null && !profesor.isEmpty()) {
            this.profesor = profesor;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El profesor no puede ser nulo o vacío");
        }
    }
}
