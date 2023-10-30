package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sentenseSmashTest {
  @Test
  public void validate() {
    assertEquals("Bilal Djaghout", sentenceSmash.smash(new String[] { "Bilal", "Djaghout" }));
  }

  @Test
  public void validateEmpty() {
    assertEquals("", sentenceSmash.smash(new String[] {}));
  }

  @Test
  public void validateOneWord() {
    assertEquals("Bilal", sentenceSmash.smash(new String[] { "Bilal" }));
  }
}
