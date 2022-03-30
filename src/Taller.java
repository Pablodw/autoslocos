

import proyecto.Vehiculo;

public class Taller {

	//Atributos de Taller
	private Vehiculo nomVehiculo;
	
	//Constructor vacio
	public Taller() {
		
	}
	//Constructor con un vehiculo
	public Taller(Vehiculo vehi) {
		this.nomVehiculo=vehi;
	}

	//Metodos
	//Cambio de color
	public void cambioColor(String color) {
		this.nomVehiculo.setColor(color);
		this.nomVehiculo.setReepintado(true);
	}
	//Cambio de color coche
	public void cambioColor(String color, Vehiculo vehi) {
		setVehiculo(vehi);
		this.nomVehiculo.setColor(color);
		this.nomVehiculo.setReepintado(true);
	}
	//Getters
	public Vehiculo getVehiculo() {
		return this.nomVehiculo;
	}
	//Setters
	public void setVehiculo(Vehiculo vehi) {
		this.nomVehiculo=vehi;
	}
}
