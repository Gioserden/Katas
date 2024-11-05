package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WhoLikesItTest {
  @Test
  public void staticTests() {
    assertEquals("no one likes this", WholikesIt.whoLikesIt());
    assertEquals("Peter likes this", WholikesIt.whoLikesIt("Peter"));
    assertEquals("Jacob and Alex like this", WholikesIt.whoLikesIt("Jacob", "Alex"));
    assertEquals("Max, John and Mark like this", WholikesIt.whoLikesIt("Max", "John", "Mark"));
    assertEquals("Alex, Jacob and 2 others like this", WholikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
  }
}
