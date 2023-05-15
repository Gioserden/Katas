/*
 * Promedio de una lista de numero enteros
 */


package katas;

import java.util.List;

public class PromedioUtil {

  public static double calcularPromedio(List<Integer> numeros) {

    return numeros.stream()
        .mapToDouble(Integer::doubleValue)
        .average()
        .orElse(0);
  }
}
