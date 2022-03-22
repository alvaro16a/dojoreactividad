package co.com.sofka.dojoreactividad.PuntoUno.operadores.model;

import java.util.Objects;

public class Correo {

    private Integer idCorreo;
    private String correo;
    private boolean enviado;


    public Correo(Integer idCorreo, String correo) {
        this.correo = correo;
        this.enviado =false;
        this.idCorreo=idCorreo;
    }

    public Correo(Integer idCorreo, String correo, boolean enviado) {
        this.correo = correo;
        this.enviado = enviado;
        this.idCorreo=idCorreo;
    }

    public Integer getIdCorreo() {
        return idCorreo;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "idCorreo=" + idCorreo +
                ", correo='" + correo + '\'' +
                ", enviado=" + enviado +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Correo)) return false;
        Correo correo1 = (Correo) o;
        return Objects.equals(idCorreo, correo1.idCorreo) && Objects.equals(correo, correo1.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCorreo, correo);
    }
}
