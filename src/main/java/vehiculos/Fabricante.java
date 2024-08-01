package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {

    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais p) {
        this.nombre = nombre;
        this.pais = p;
        Pais.agregarPais(p);
    }

    public Fabricante() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public Pais getPais() {
        return this.pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static void agregarFabricante(Fabricante f) {
        Fabricante.fabricantes.add(f);

    }

    public static Fabricante fabricaMayorVentas() {

        Fabricante fabricanteMayor = new Fabricante();
        int mayor = 0;

        for (Fabricante f : fabricantes) {
            int num = Collections.frequency(fabricantes, f);
            if (num > mayor) {
                mayor = num;
                fabricanteMayor = f;
            }

        }

        return fabricanteMayor;
    }
}