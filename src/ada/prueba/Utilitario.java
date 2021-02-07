package ada.prueba;

import java.util.List;

public class Utilitario extends Automotor{
    public Utilitario(String tipoDeUso, Persona propietario, List<Persona> autorizados) {
        super(tipoDeUso, propietario, autorizados);
    }

    public Utilitario(String tipoDeUso, String propietario) {
        super(tipoDeUso, propietario);
    }
}
