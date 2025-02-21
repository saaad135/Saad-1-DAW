package test;

import clases.calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class testCalculadora {

    private static calculadora calculadora;

    @BeforeAll
    public static void setUp() {
        calculadora = new calculadora();
        System.out.println("Inicialización de Calculadora para pruebas");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Finalización de las pruebas de Calculadora");
    }

    @Test
    public void pru_numerosRomanos_sumaDosNumerosPositivos() {
        int resultado = calculadora.suma(3, 5);
        assertEquals(8, resultado, "La suma de 3 y 5 debe ser 8");
    }

    @Test
    public void pru_numerosRomanos_sumaPositivoNegativo() {
        int resultado = calculadora.suma(10, -5);
        assertEquals(5, resultado, "La suma de 10 y -5 debe ser 5");
    }

    @Test
    public void pru_numerosRomanos_restaDosNumeros() {
        int resultado = calculadora.resta(10, 5);
        assertEquals(5, resultado, "La resta de 10 y 5 debe ser 5");
    }

    @Test
    public void pru_numerosRomanos_divisionDosNumeros() {
        int resultado = calculadora.divide(10, 2);
        assertEquals(5, resultado, "La división de 10 entre 2 debe ser 5");
    }

    @Test
    public void pru_numerosRomanos_divisionPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(10, 0), "Debe lanzar una excepción al dividir por cero");
    }

    @Test
    public void pru_numerosRomanos_raizCuadradaPositiva() {
        double resultado = calculadora.raizCuadrada(16);
        assertEquals(4, resultado, "La raíz cuadrada de 16 debe ser 4");
    }

    @Test
    public void pru_numerosRomanos_raizCuadradaCero() {
        double resultado = calculadora.raizCuadrada(0);
        assertEquals(0, resultado, "La raíz cuadrada de 0 debe ser 0");
    }

    @Test
    public void pru_numerosRomanos_raizCuadradaNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.raizCuadrada(-9), "Debe lanzar una excepción para raíz cuadrada de número negativo");
    }

    @Test
    public void pru_numerosRomanos_sumaConCero() {
        int resultado = calculadora.suma(0, 7);
        assertEquals(7, resultado, "La suma de 0 y 7 debe ser 7");
    }

    @Test
    public void pru_numerosRomanos_comprobarSumaPositiva() {
        int resultado = calculadora.suma(4, 3);
        assertTrue(resultado > 0, "El resultado debe ser positivo");
    }
}