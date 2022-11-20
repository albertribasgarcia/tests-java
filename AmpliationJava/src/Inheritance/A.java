package Inheritance;

import java.io.Serializable;

public class A implements Serializable{
    public final static long serialVersionUID = 1L;
    private Integer formulariSolicitudId;
    private Integer personaId;
    private Integer tipusRepresentacioId;
    private String identificador;
    private Integer tipusidentificadorId;

    public A(){

    }

    public Integer getFormulariSolicitudId() {
        return formulariSolicitudId;
    }

    public void setFormulariSolicitudId(Integer formulariSolicitudId) {
        this.formulariSolicitudId = formulariSolicitudId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Integer getTipusRepresentacioId() {
        return tipusRepresentacioId;
    }

    public void setTipusRepresentacioId(Integer tipusRepresentacioId) {
        this.tipusRepresentacioId = tipusRepresentacioId;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getTipusidentificadorId() {
        return tipusidentificadorId;
    }

    public void setTipusidentificadorId(Integer tipusidentificadorId) {
        this.tipusidentificadorId = tipusidentificadorId;
    }
}
