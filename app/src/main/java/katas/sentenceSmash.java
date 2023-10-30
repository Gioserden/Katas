package katas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sentenceSmash {
  public static String smash(String... words) {
    return Arrays.asList(words).stream()
      .collect(Collectors.joining(" "));
  }
}
