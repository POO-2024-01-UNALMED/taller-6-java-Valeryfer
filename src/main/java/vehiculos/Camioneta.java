package vehiculos;

public class Camioneta extends Vehiculo {
    private static int numCamionetas = 0;
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,
            boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Camioneta.numCamionetas++;
    }

    public static int getNumCamionetas() {
        return numCamionetas;
    }

    public static void setNumCamionetas(int numCamionetas) {
        Camioneta.numCamionetas = numCamionetas;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}