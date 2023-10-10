package Carreras;

import objetos.CoordinadorCarrera;

public class Carrera {
    private String nombre; // Cambié el nombre de la variable para seguir las convenciones de nombres
    private String codCarrera;
    private CoordinadorCarrera coordinadorCarrera; // Cambié el tipo de variable para usar CoordinadorCarrera
    private int duracionSemestres;

    // Getter para el nombre de la carrera
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre de la carrera
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre de la carrera no puede ser nulo ni vacío");
        }
    }

    // Getter para el código de la carrera
    public String getCodCarrera() {
        return codCarrera;
    }

    // Setter para el código de la carrera
    public void setCodCarrera(String codCarrera) {
        if (codCarrera != null && !codCarrera.isEmpty()) {
            this.codCarrera = codCarrera;
        } else {
            throw new IllegalArgumentException("El código de la carrera no puede ser nulo ni vacío");
        }
    }

    // Getter para el coordinador de carrera
    public CoordinadorCarrera getCoordinadorCarrera() {
        return coordinadorCarrera;
    }

    // Setter para el coordinador de carrera
    public void setCoordinadorCarrera(CoordinadorCarrera coordinadorCarrera) {
        this.coordinadorCarrera = coordinadorCarrera;
    }

    // Getter para la duración en semestres
    public int getDuracionSemestres() {
        return duracionSemestres;
    }

    // Setter para la duración en semestres
    public void setDuracionSemestres(int duracionSemestres) {
        if (duracionSemestres >= 0) {
            this.duracionSemestres = duracionSemestres;
        } else {
            throw new IllegalArgumentException("La duración en semestres no puede ser un valor negativo");
        }
    }
}
