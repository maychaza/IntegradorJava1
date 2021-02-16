package ada.prueba;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    List<Automotor> automotores;

    public Registro() {
        automotores = new ArrayList<>();
    }

    public List<Automotor> getAutomotores() {
        return automotores;
    }

    public void setAutomotores(List<Automotor> automotores) {
        this.automotores = automotores;
    }

    public void agregarAutom(Automotor i){
        automotores.add(i);
    }




}
