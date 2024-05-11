package com.app.backend.model;

import java.sql.Date;

public class Alumno {

    private String primerNombre;


    private String segundoNombre;


    private String apellidoPat;


    private String apellidoMat;


    private Date fechaNac;


    private String curp;


    private String email;


    public Alumno(String primerNombre, String segundoNombre, String apellidoPat, String apellidoMat, Date fechaNac, String curp, String email){
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoMat = apellidoMat;
        this.apellidoPat = apellidoPat;
        this.fechaNac = fechaNac;
        this.curp = curp;
        this.email = email;
    }

    public Alumno(){}
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}