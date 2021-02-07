package ada.prueba;

import java.util.List;

public class Colectivo extends Automotor {

    public Colectivo(String tipoDeUso, Persona propietario, List<Persona> autorizados) {
        super(tipoDeUso, propietario, autorizados);
    }

    public Colectivo(String tipoDeUso, String propietario) {
        super(tipoDeUso, propietario);
    }
}
