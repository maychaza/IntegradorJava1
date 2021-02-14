package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Automotor {
    protected String tipoDeUso; //particular o profesional, boolean?
    protected List<Persona> autorizados= new ArrayList<>();
    protected Persona propietario= new Persona("Esteban", 33398548, "Larralde 332");


    public Automotor(String tipoDeUso, Persona propietario) {
        this.tipoDeUso = tipoDeUso;
        this.propietario = propietario;
    }

    public String getTipoDeUso() {
        return tipoDeUso;
    }

    public void setTipoDeUso(String tipoDeUso) {
        this.tipoDeUso = tipoDeUso;
    }

    public List<Persona> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Persona> autorizados) {
        this.autorizados = autorizados;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }



}
