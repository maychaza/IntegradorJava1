package ada.prueba;

import java.util.List;

public class Camion extends Automotor {
    public Camion(String tipoDeUso, Persona propietario, List<Persona> autorizados) {
        super(tipoDeUso, propietario, autorizados);
    }

    public Camion(String tipoDeUso, String propietario) {
        super(tipoDeUso, propietario);
    }
}
