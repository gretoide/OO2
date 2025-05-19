package ar.edu.info.unlp.CalculoDeSueldo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @Test
    public void testTemporarioCalcularSueldoAdicional() {
        Temporario emp1 = new Temporario(2, true, 120);
        double sueldoAdicional = emp1.calcularSueldoAdicional();
        assertEquals(9000.0, sueldoAdicional, 0.001);

        Temporario emp2 = new Temporario(0, false, 80);
        sueldoAdicional = emp2.calcularSueldoAdicional();
        assertEquals(0.0, sueldoAdicional, 0.001);
    }

    @Test
    public void testTemporarioCalcularSueldoBasico() {
        Temporario emp1 = new Temporario(2, true, 120);
        double sueldoBasico = emp1.calcularSueldoBasico();
        assertEquals(56000.0, sueldoBasico, 0.001);

        Temporario emp2 = new Temporario(0, false, 50);
        sueldoBasico = emp2.calcularSueldoBasico();
        assertEquals(35000.0, sueldoBasico, 0.001);
    }

    @Test
    public void testPasanteCalcularSueldoAdicional() {
        Pasante emp1 = new Pasante(2, true, 5);
        double sueldoAdicional = emp1.calcularSueldoAdicional();
        assertEquals(10000.0, sueldoAdicional, 0.001);

        Pasante emp2 = new Pasante(0, false, 2);
        sueldoAdicional = emp2.calcularSueldoAdicional();
        assertEquals(4000.0, sueldoAdicional, 0.001);
    }

    @Test
    public void testPasanteCalcularSueldoBasico() {
        Pasante emp1 = new Pasante(2, true, 5);
        double sueldoBasico = emp1.calcularSueldoBasico();
        assertEquals(20000.0, sueldoBasico, 0.001);

        Pasante emp2 = new Pasante(0, false, 2);
        sueldoBasico = emp2.calcularSueldoBasico();
        assertEquals(20000.0, sueldoBasico, 0.001);
    }

    @Test
    public void testPlantaCalcularSueldoAdicional() {
        Planta emp1 = new Planta(2, true, 5);
        double sueldoAdicional = emp1.calcularSueldoAdicional();
        assertEquals(19000.0, sueldoAdicional, 0.001);

        Planta emp2 = new Planta(0, false, 2);
        sueldoAdicional = emp2.calcularSueldoAdicional();
        assertEquals(4000.0, sueldoAdicional, 0.001);
    }

    @Test
    public void testPlantaCalcularSueldoBasico() {
        Planta emp1 = new Planta(2, true, 5);
        double sueldoBasico = emp1.calcularSueldoBasico();
        assertEquals(50000.0, sueldoBasico, 0.001);

        Planta emp2 = new Planta(0, false, 2);
        sueldoBasico = emp2.calcularSueldoBasico();
        assertEquals(50000.0, sueldoBasico, 0.001);
    }
}