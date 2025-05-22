package ejercicio_2_calculo_de_sueldo;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Empleado {

	private Integer cantidadHijos;
	private Boolean casado;
	
	public Empleado(Integer cantidadHijos, Boolean casado) {
		this.cantidadHijos = cantidadHijos;
		this.casado = casado;
	}
	
	public double calcularSueldo(){
		return (this.calcularSueldoBasico() + this.calcularSueldoAdicional()) - this.calcularDescuento();
	}
	
	public double calcularDescuento() {
		return this.calcularSueldoBasico() * 0.13 + this.calcularSueldoAdicional() * 0.5;
	}

	abstract double calcularSueldoAdicional();

	abstract double calcularSueldoBasico();

	public Integer getCantidadHijos() {
		return cantidadHijos;
	}

	public Boolean getCasado() {
		return casado;
	}

}
