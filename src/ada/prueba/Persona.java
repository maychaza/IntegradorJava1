package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private Integer dni;
    private String direccion;


    public Persona(String nombre, Integer dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // creo personas
    Persona propietario1= new Persona("María", 262254, "Lapepita 233");
    Persona propietario2= new Persona("Lucas", 383554, "De la cruz 855");
    Persona propietario3= new Persona("Jorge", 458254, "M fierro 875");
    Persona propietario4= new Persona("Luciana", 338854, "Tres arboles 1102");
    Persona propietario5= new Persona("Sol", 265254, "Junín 52");
    Persona propietario6= new Persona("Esteban", 300254, "Robledo 6400");
    Persona propietario7= new Persona("Julieta", 377254, "Don bosco 2045");
}
