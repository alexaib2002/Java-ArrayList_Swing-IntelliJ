package org.uem.dam.GestorCorredores.model;

public class Corredor {
    String nombre, dorsal, modalidad;
    boolean sexo;
    int edad;

    public Corredor(String nombre, String dorsal, String modalidad, boolean sexo, int edad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.modalidad = modalidad;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDorsal() {
        return dorsal;
    }

    public String getModalidad() {
        return modalidad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
}
