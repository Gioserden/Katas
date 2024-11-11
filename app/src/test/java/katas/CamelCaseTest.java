package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CamelCaseTest {
  @Test
  public void testSomeUnderscoreLowerStart() {
    String input = "the_Stealth_Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", CamelCase.stringToCamelCase(input));
  }

  @Test
  public void testSomeDashLowerStart() {
    String input = "the-Stealth-Warrior";
    System.out.println("input: " + input);
    assertEquals("theStealthWarrior", CamelCase.stringToCamelCase(input));
  }
}
