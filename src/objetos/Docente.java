package objetos;

import java.util.ArrayList;
import java.util.List;

public class Docente extends persona {

    private int horasSemanalesMaximas;
    private List<BloqueClase> bloquesDeClase;

    public int getHorasSemanalesMaximas() {
        return horasSemanalesMaximas;
    }

    public void setHorasSemanalesMaximas(int horasSemanalesMaximas) {
        if (horasSemanalesMaximas >= 0 && horasSemanalesMaximas <= 28) {
            this.horasSemanalesMaximas = horasSemanalesMaximas;
        } else {
            throw new IllegalArgumentException("Las horas semanales máximas deben estar entre 0 y 28");
        }
    }

    public List<BloqueClase> getBloquesDeClase() {
        return bloquesDeClase;
    }

    public void setBloquesDeClase(List<BloqueClase> bloquesDeClase) {
        if (bloquesDeClase != null) {
            this.bloquesDeClase = bloquesDeClase;
        } else {
            throw new IllegalArgumentException("La lista de bloques de clase no puede ser nula");
        }
    }
    
    // Constructor
    public Docente() {
        this.bloquesDeClase = new ArrayList<>();
    }
}

class BloqueClase {

    private int diaSemana; // Por ejemplo, 1 para lunes, 2 para martes, etc.
    private int horaInicio;
    private int horaFin;

    public BloqueClase(int diaSemana, int horaInicio, int horaFin) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(int diaSemana) {
        if (diaSemana >= 1 && diaSemana <= 7) {
            this.diaSemana = diaSemana;
        } else {
            throw new IllegalArgumentException("El día de la semana debe estar entre 1 y 7");
        }
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        if (horaInicio >= 0 && horaInicio <= 23) {
            this.horaInicio = horaInicio;
        } else {
            throw new IllegalArgumentException("La hora de inicio debe estar entre 0 y 23");
        }
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        if (horaFin >= 0 && horaFin <= 23) {
            this.horaFin = horaFin;
        } else {
            throw new IllegalArgumentException("La hora de fin debe estar entre 0 y 23");
        }
    }
}
