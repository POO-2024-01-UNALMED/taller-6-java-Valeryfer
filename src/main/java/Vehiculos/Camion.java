package vehiculos;

public class Camion extends Vehiculo {
    int ejes;
    int puertas = 2;
    long velocidadMaxima = 80;
    String traccion = "4X2";

    public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
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