package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class DNRPA {
    /*
    La DNRPA necesita un sistema para anotar todos los vehículos registrados en el país.
    La DNRPA tiene Registros seccionales.
    Cada Registro tiene automotores registrados.
    Los automotores pueden ser de uso particular o profesional.
    Se registran motos eléctricas, autos eléctricos, motocicletas
     y automóviles a combustión, colectivos, utilitarios y camiones.
    Todos los vehículos tienen un único propietario y autorizados a conducir.
    De los propietarios y autorizados se sabe el nombre, DNI y dirección.

    1)Se desea poder listar todos los autos registrados en todas las seccionales.
    2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.
     */

    public static void main(String[] args) {
        List<Registro> registrosSeccionales= new ArrayList<>();

        Auto auto = new Auto("Particular", "Jorge Camastro", "Julieta Ballina");
        Persona propietario1= new Persona("Juan minujin", 37067100, "Pichincha 3344 - Ituzaingó");
        ;


        Moto moto = new Moto("Particular", "Anibal Lopez", "Damaris Lopez");
        Camion camion = new Camion("Profesional", "Erika Gonzalez");
        Utilitario utilitario= new Utilitario("Profesional", "Juana Gomez");
        Colectivo colectivo = new Colectivo("Profesional", "Robert Garcia");


    }
}
