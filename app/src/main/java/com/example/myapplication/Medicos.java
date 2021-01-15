package com.example.myapplication;

public class Medicos {

    private int id_medico;
    private String nombre_medico;

    public Medicos(){

    }


    public Medicos( int id_medico, String nombre_medico){
        this.id_medico = id_medico;
        this.nombre_medico = nombre_medico;
    }

    public String toString(){
        return nombre_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public void setNombre_medico(String nombre_medico) {
        this.nombre_medico = nombre_medico;
    }
}
