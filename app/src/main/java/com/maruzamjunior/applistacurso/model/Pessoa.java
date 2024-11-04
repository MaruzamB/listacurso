package com.maruzamjunior.applistacurso.model;

public class Pessoa {

    //criação dos atributos
    //
    private String primeiroNome;
    private String SobreNome;
    private String CursoDesejado;
    private String telefoneContato;

    //criação do construtor padrão
    public Pessoa() {}
    //criação dos gets e sets
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public String getCursoDesejado() {
        return CursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        CursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", CursoDesejado='" + CursoDesejado + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }
}
