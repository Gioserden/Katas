package katas;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals("Position of alphabet: 1", AlphaPosition.position('a'));
    assertEquals("Position of alphabet: 26", AlphaPosition.position('z'));
    assertEquals("Position of alphabet: 5", AlphaPosition.position('e'));
  }
}
