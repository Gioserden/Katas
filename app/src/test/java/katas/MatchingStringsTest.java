package katas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MatchingStringsTest {
  @Test
  public void test1(){
    List<String> strings = new ArrayList<>();
    List<String> querys = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    strings.addAll(Arrays.asList("ab", "ab", "abc"));
    querys.addAll(Arrays.asList("ab", "abc", "bc"));
    numbers.addAll(Arrays.asList(2, 1, 0));

    assertEquals(numbers, MatchingStrings.solution(strings, querys));
  }
}
