package ejercicio_2_calculo_de_sueldo;

public class Temporario extends Empleado {
	private Integer cantidadHoras;
	
	public Temporario(Integer cantidadHijos, Boolean casado, Integer cantidadHoras) {
		super(cantidadHijos, casado);
		this.cantidadHoras = cantidadHoras;
	}

	public Integer getCantidadHoras() {
		return cantidadHoras;
	}

	@Override
	public double calcularSueldoAdicional() {
		// Condicion ? valor_si_verdadero : valor_si_falso
	    return 2000 * this.getCantidadHijos() + (this.getCasado() ? 5000 : 0);
	}

	@Override
	double calcularSueldoBasico() {
		return 20000 + (this.getCantidadHoras() * 300);
	}

	
	
	
	
}
	