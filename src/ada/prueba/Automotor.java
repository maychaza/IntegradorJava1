package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Automotor {
    private String tipoDeUso; //particular o profesional

    List<Persona> autorizados= new ArrayList<>();
    Persona propietario1= new Persona("Juan minujin", 37067100, "Pichincha 3344 - Ituzaingó");
    

    public Automotor(String tipoDeUso, Persona propietario, List<Persona> autorizados) {
        this.tipoDeUso = tipoDeUso;
        this.propietario1 = propietario;
        this.autorizados = autorizados;
    }

    public Automotor(String tipoDeUso, String propietario) {
    }
}
