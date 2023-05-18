package katas;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PromedioUItilTest {
  @Test
  public void testCalcularPromedio() {
    // Caso de prueba 1
    List<Integer> numeros1 = Arrays.asList(5, 10, 15, 20, 25);
    double promedio1 = PromedioUtil.calcularPromedio(numeros1);
    assertEquals(15.0, promedio1, 0.01);

    // Caso de prueba 2
    List<Integer> numeros2 = Arrays.asList(2, 4, 6, 8, 10);
    double promedio2 = PromedioUtil.calcularPromedio(numeros2);
    assertEquals(6.0, promedio2, 0.01);

    // Caso de prueba 3: Lista vacía
    List<Integer> numeros3 = Arrays.asList();
    double promedio3 = PromedioUtil.calcularPromedio(numeros3);
    assertEquals(0.0, promedio3, 0.01);

    // Caso de prueba 4: Lista con un único elemento
    List<Integer> numeros4 = Arrays.asList(100);
    double promedio4 = PromedioUtil.calcularPromedio(numeros4);
    assertEquals(100.0, promedio4, 0.01);

    // Caso de prueba 5: Números negativos
    List<Integer> numeros5 = Arrays.asList(-10, -20, -30, -40, -50);
    double promedio5 = PromedioUtil.calcularPromedio(numeros5);
    assertEquals(-30.0, promedio5, 0.01);
  }
}
