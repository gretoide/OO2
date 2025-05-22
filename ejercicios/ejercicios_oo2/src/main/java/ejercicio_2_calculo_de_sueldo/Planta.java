package ejercicio_2_calculo_de_sueldo;

public class Planta extends Empleado {
	private Integer aniosAntiguedad;
	
	public Planta(Integer cantidadHijos, Boolean casado, Integer aniosAntiguedad) {
		super(cantidadHijos, casado);
		this.aniosAntiguedad = aniosAntiguedad;
	}
	
	public Integer getAniosAntiguedad() {
		return aniosAntiguedad;
	}

	@Override
	double calcularSueldoAdicional() {
		return (this.getCantidadHijos() * 2000) + (this.getAniosAntiguedad() * 2000) + (this.getCasado()? 5000 : 0);
	}

	@Override
	double calcularSueldoBasico() {
		return 50000;
	}
	
}



