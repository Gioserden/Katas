package katas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JadenCaseTest {
  JadenCase jadenCase = new JadenCase();

  @Test
  public void test() {
    assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", "Most Trees Are Blue",
        jadenCase.toJadenCase("most trees are blue"));
  }

  @Test
  public void testNullArg() {
    assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
  }

  @Test
  public void testEmptyArg() {
    assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
  }

  @Test
  public void testToJadenCaseWithValidString() {
    assertEquals("Hello World", jadenCase.toJadenCase("hello world"));
  }

  @Test
  public void testToJadenCaseWithWhitespaceString() {
    assertNull(jadenCase.toJadenCase("   "));
  }

  @Test
  public void testToJadenCaseWithSingleLowercaseCharacter() {
    assertEquals("A", jadenCase.toJadenCase("a"));
  }

  @Test
  public void testToJadenCaseWithSingleUppercaseCharacter() {
    assertEquals("Z", jadenCase.toJadenCase("Z"));
  }

  @Test
  public void testToJadenCaseWithAllUppercaseString() {
    assertEquals("HELLO WORLD", jadenCase.toJadenCase("HELLO WORLD"));
  }

  @Test
  public void testToJadenCaseWithAllLowercaseString() {
    assertEquals("Hello World", jadenCase.toJadenCase("hello world"));
  }

  @Test
  public void testToJadenCaseWithMixedCaseString() {

    assertEquals("HeLlO WoRlD", jadenCase.toJadenCase("HeLlO WoRlD"));
  }
}
