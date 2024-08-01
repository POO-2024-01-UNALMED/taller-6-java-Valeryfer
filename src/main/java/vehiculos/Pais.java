package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> paiseslist = new ArrayList<Pais>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarPais(Pais p) {
        Pais.paiseslist.add(p);

    }

    public static Pais paisMasVendedor() {
        Pais paisMayor = new Pais();
        int mayor = 0;
        for (Pais p : paiseslist) {
            int num = Collections.frequency(paiseslist, p);
            if (num > mayor) {
                mayor = num;
                paisMayor = p;

            }

        }

        return paisMayor;
    }

}