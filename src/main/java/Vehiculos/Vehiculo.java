package vehiculos;

public class Vehiculo {
    String placa;
    int puertas;
    int velocidadMaxima;
    String nombre;
    long precio;
    float peso;
    String traccion;
    Fabricante fabricante;
    int cantidadVehiculos;
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getPrecio() {
        return precio;
    }
    
    public void setPrecio(long precio) {
        this.precio = precio;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String getTraccion() {
        return traccion;
    }
    
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    
    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }
}