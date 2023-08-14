package com.eventoapp.demo.models;

public class Evento {
    private String Nome;
    private String Local;
    private String Data;
    private String Horario;
    public String getNome() {
        return Nome;
    }
    public String getLocal() {
        return Local;
    }
    public String getData() {
        return Data;
    }
    public String getHorario() {
        return Horario;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setLocal(String local) {
        Local = local;
    }
    public void setData(String data) {
        Data = data;
    }
    public void setHorario(String horario) {
        Horario = horario;
    }

}
