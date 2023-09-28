/* 
 * Clase Persona
 */
package katas.persona;

public class Persona {

  private String name;
  private int age;

  public Persona(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals (Object obj) {
    // Si el objeto es nulo, devuelve falso
    if (obj == null) {
      return false;
    }
    // Si el objeto es de una clase diferente, devuelve falso
    if (obj.getClass () != this.getClass ()) {
      return false;
    }
    // Si el objeto es el mismo, devuelve verdadero
    if (this == obj) {
      return true;
    }
    // Si el objeto es una instancia de Persona, compara sus atributos
    Persona otra = (Persona) obj;
    return this.name.equals (otra.name) && this.age == otra.age;
  }
}
