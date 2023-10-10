package objetos;

import java.util.Date; // Importa la clase Date para la fecha de nacimiento

public class persona {

    private String nombre;
    private String apellido;
    private String sexo;
    private Date fecNac; // Cambia el tipo de fecNac a Date
    private String cedula;
    private String direccion;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El apellido no puede ser nulo o vacío");
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo != null && !sexo.isEmpty()) {
            this.sexo = sexo;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El sexo no puede ser nulo o vacío");
        }
    }

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        if (fecNac != null) {
            this.fecNac = fecNac;
        } else {
            // Lanzar una excepción si la fecha de nacimiento es nula
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula != null && !cedula.isEmpty()) {
            this.cedula = cedula;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La cédula no puede ser nula o vacía");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.isEmpty()) {
            this.direccion = direccion;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("La dirección no puede ser nula o vacía");
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.isEmpty()) {
            this.telefono = telefono;
        } else {
            // Lanzar una excepción si el valor es nulo o vacío
            throw new IllegalArgumentException("El teléfono no puede ser nulo o vacío");
        }
    }
}
