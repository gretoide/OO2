package ejercicio_2_calculo_de_sueldo;

public class Pasante extends Empleado {
	private Integer cantidadExamen;
	
	public Pasante(Integer cantidadHijos, Boolean casado, Integer cantidadExamen) {
		super(cantidadHijos, casado);
		this.cantidadExamen = cantidadExamen;
	}

	public Integer getCantidadExamen() {
		return cantidadExamen;
	}

	@Override
	double calcularSueldoAdicional() {
		return this.getCantidadExamen() * 2000;
	}

	@Override
	double calcularSueldoBasico() {
		return 20000;
	}

	
	
	
	
}
	