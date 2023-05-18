/* 
 * Metodos para Personas
*/

package katas.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaFilters {
  public List<Persona> ageFilterOlder(List<Persona> lista, int age) {
    List<Persona> res = new ArrayList<>();
    res = lista.stream()
        .filter(p -> p.getAge() >= age)
        .collect(Collectors.toList());
    return res;
  }

  public List<Persona> ageFilterYoung(List<Persona> lista, int age) {
    List<Persona> res = new ArrayList<>();
    res = lista.stream()
        .filter(p -> p.getAge() <= age)
        .collect(Collectors.toList());
    return res;
  }
}
