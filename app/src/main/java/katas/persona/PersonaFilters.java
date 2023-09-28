/* 
 * Metodos para Personas
*/

package katas.persona;

import java.util.List;
import java.util.stream.Collectors;

public class PersonaFilters {
  public List<Persona> ageFilterOlder(List<Persona> lista, int age) {
    List<Persona> res;
    res = lista.stream()
        .filter(p -> p.getAge() >= age)
        .collect(Collectors.toList());
    return res;
  }

  public List<Persona> ageFilterYoung(List<Persona> lista, int age) {
    List<Persona> res;
    res = lista.stream()
        .filter(p -> p.getAge() <= age)
        .collect(Collectors.toList());
    return res;
  }

  public List<Persona> ageFilterSame(List<Persona> lista, int age) {
    List<Persona> res;
    res = lista.stream()
        .filter(p -> p.getAge() == age)
        .collect(Collectors.toList());
    return res;
  }
}
