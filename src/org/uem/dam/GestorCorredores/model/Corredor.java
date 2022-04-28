package org.uem.dam.GestorCorredores.model;

public class Corredor {
    final String nombre;
    final int dorsal;
    final String modalidad;
    final boolean sexo;
    final int edad;

    public Corredor(String nombre, int dorsal, String modalidad, boolean sexo, int edad) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.modalidad = modalidad;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
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
