package katas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import katas.persona.Persona;
import katas.persona.PersonaFilters;

public class PersonaTest {
  PersonaFilters personaFilters = new PersonaFilters();

  @Test
  public void testOlderPerson() {
    // Actual List
    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona("Sergio", 38));
    personas.add(new Persona("Roberto", 25));
    personas.add(new Persona("Angela", 17));
    personas.add(new Persona("Juan", 12));
    personas.add(new Persona("Daniela", 48));
    personas.add(new Persona("Julia", 15));

    // Expected list
    List<Persona> expectedList = new ArrayList<>();
    expectedList.add(new Persona("Sergio", 38));
    expectedList.add(new Persona("Roberto", 25));
    expectedList.add(new Persona("Daniela", 48));

    // Actual list
    List<Persona> actual = new ArrayList<>();
    actual = personaFilters.ageFilterOlder(personas, 18);

    assertEquals("number of persons", 3, actual.size(), 0);
    // Compare if the list have de same names and ages
    assertEquals(expectedList, actual);
  }

  @Test
  public void testYoungerPerson() {
    // Actual List
    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona("Sergio", 38));
    personas.add(new Persona("Roberto", 25));
    personas.add(new Persona("Angela", 17));
    personas.add(new Persona("Juan", 12));
    personas.add(new Persona("Daniela", 48));
    personas.add(new Persona("Julia", 15));

    // Expected list
    List<Persona> expectedList = new ArrayList<>();
    expectedList.add(new Persona("Juan", 12));
    expectedList.add(new Persona("Julia", 15));

    // Actual list
    List<Persona> actual = new ArrayList<>();
    actual = personaFilters.ageFilterYoung(personas, 15);

    assertEquals("number of persons", 2, actual.size(), 0);
    // Compare if the list have de same names and ages
    assertEquals(expectedList, actual);
  }

  @Test
  public void testSameAge() {
    // List
    List<Persona> personas = new ArrayList<>();
    personas.add(new Persona("Angel", 12));
    personas.add(new Persona("Roberta", 62));
    personas.add(new Persona("Julio", 41));
    personas.add(new Persona("Juana", 70));
    personas.add(new Persona("Claudia", 15));
    personas.add(new Persona("Jorge", 39));
    personas.add(new Persona("Alejandra", 15));

    // Expected list
    List<Persona> expectedList = new ArrayList<>();
    expectedList.add(new Persona("Claudia", 15));
    expectedList.add(new Persona("Alejandra", 15));

    // Actual list
    List<Persona> actual = new ArrayList<>();
    actual = personaFilters.ageFilterSame(personas, 15);

    assertEquals("number of persons", 2, actual.size(), 0);
    // Compare if the list have de same names and ages
    assertEquals(expectedList, actual);
  }

}
