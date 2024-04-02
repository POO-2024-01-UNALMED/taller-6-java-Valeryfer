package vehiculos;

public class Camioneta extends Vehiculo {
    boolean volco;
    long velocidadMaxima = 90; 
    String traccion = "4X4";

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
    public long getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(long velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String getTraccion() {
        return traccion;
    }
    
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
