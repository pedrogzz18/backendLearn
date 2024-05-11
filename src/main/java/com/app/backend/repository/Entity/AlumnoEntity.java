package com.app.backend.repository.Entity;
import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "alumno")
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="alumno_id")
    private Long alumnoId;

    @Column(name="primer_nombre")
    private String primerNombre;

    @Column(name="segundo_nombre")
    private String segundoNombre;

    @Column(name="apellido_pat")
    private String apellidoPat;

    @Column(name="apellido_mat")
    private String apellidoMat;

    @Column(name="fecha_nac")
    private Date fechaNac;

    @Column(name="curp")
    private String curp;

    @Column(name="email")

    private String email;


    public AlumnoEntity(String primerNombre, String segundoNombre, String apellidoMat, String apellidoPat, Date fechaNac, String curp, String email){
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoMat = apellidoMat;
        this.apellidoPat = apellidoPat;
        this.fechaNac = fechaNac;
        this.curp = curp;
        this.email = email;
    }

    public AlumnoEntity(){}

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

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
