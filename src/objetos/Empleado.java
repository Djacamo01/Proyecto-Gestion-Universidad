package objetos;

public class Empleado extends persona {

    private String codINSS;
    private String facultad;
    private double salario;
    private double bonificacion;

    public String getCodINSS() {
        return codINSS;
    }

    public void setCodINSS(String codINSS) {
        if (codINSS != null && !codINSS.isEmpty()) {
            this.codINSS = codINSS;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El código INSS no puede ser nulo o vacío");
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            // Lanzar una excepción si el valor es negativo
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        if (bonificacion >= 0) {
            this.bonificacion = bonificacion;
        } else {
            // Lanzar una excepción si el valor es negativo
            throw new IllegalArgumentException("La bonificación no puede ser negativa");
        }
    }
}
