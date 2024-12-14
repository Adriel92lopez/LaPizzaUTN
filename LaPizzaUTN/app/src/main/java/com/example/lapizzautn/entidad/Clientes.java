package com.example.lapizzautn.entidad;

public class Clientes {
    private int ID;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String email;
    private String direccion;
    private String telefono;
    private String clave;

// ---------Constructor-----------
    public Clientes(int ID, String nombre, String apellido, String fechaNac, String email, String direccion, String telefono, String clave) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clave = clave;
    }

    // ---------Getters and Setters----------
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
