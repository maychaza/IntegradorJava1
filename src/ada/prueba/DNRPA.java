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
        Registro capitalFederal = new Registro();
        List<Automotor> automotores= capitalFederal.getAutomotores();

        // creo personas
        Persona propietario1= new Persona("María", 262254, "Lapepita 233");
        Persona propietario2= new Persona("Lucas", 383554, "De la cruz 855");
        Persona propietario3= new Persona("Jorge", 458254, "M fierro 875");
        Persona propietario4= new Persona("Luciana", 338854, "Tres arboles 1102");
        Persona propietario5= new Persona("Sol", 265254, "Junín 52");
        Persona propietario6= new Persona("Esteban", 300254, "Robledo 6400");
        Persona propietario7= new Persona("Julieta", 377254, "Don bosco 2045");
        Persona propietario8= new Persona("Ana", 112254, "M fierro 875");
        Persona propietario9= new Persona("Gonzalo", 498854, "Ehrlich 70");
        Persona propietario10= new Persona("Matías", 335254, "Defilippa 140");
        Persona propietario11= new Persona("Alejandra", 380254, "Florida 35");
        Persona propietario12= new Persona("Lola", 447254, "Arribeños 200");




        //creo automot
        Moto moto1 = new Moto("Particular", propietario1);
        Camion camion1 = new Camion("Profesional", propietario2);
        Utilitario utilitario1= new Utilitario("Profesional", propietario3);
        Colectivo colectivo1 = new Colectivo("Profesional", propietario4);
        Auto auto1= new Auto("particular", propietario5);
        Auto auto2= new Auto("particular", propietario6);

        //agrego automot

        automotores.add(moto1);
        automotores.add(camion1);
        automotores.add(utilitario1);
        automotores.add(colectivo1);
        automotores.add(auto1);
        automotores.add(auto2);

        //agrego al registro

        capitalFederal.agregarAutom(moto1);
        capitalFederal.agregarAutom(camion1);
        capitalFederal.agregarAutom(utilitario1);
        capitalFederal.agregarAutom(colectivo1);
        capitalFederal.agregarAutom(auto1);
        capitalFederal.agregarAutom(auto2);

       // -----------------------------NUEVO REGISTRO-----------------------------------

        Registro ituzaingo= new Registro();
        Auto auto3= new Auto("particular",  propietario7);
        Auto auto4= new Auto("particular", propietario8);
        Auto auto5= new Auto("profesional", propietario9);
        Camion camion2 = new Camion("Profesional", propietario10);
        Camion camion3 = new Camion("Profesional", propietario11);
        Camion camion4 = new Camion("Profesional", propietario12);

        automotores.add(auto3);
        automotores.add(auto4);
        automotores.add(auto5);
        automotores.add(camion2);
        automotores.add(camion3);
        automotores.add(camion4);

        ituzaingo.agregarAutom(auto3);
        ituzaingo.agregarAutom(auto4);
        ituzaingo.agregarAutom(auto5);
        ituzaingo.agregarAutom(camion2);
        ituzaingo.agregarAutom(camion3);
        ituzaingo.agregarAutom(camion3);


        System.out.println(automotores.getClass(Auto));




    }
}
