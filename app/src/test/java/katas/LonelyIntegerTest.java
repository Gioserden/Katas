package katas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LonelyIntegerTest {
  List<Integer> a = new ArrayList<Integer>();

  @Test
  public void test1() {
    a.add(0, 1);
    a.add(1, 2);
    a.add(2, 3);
    a.add(3, 4);
    a.add(4, 3);
    a.add(1, 2);
    a.add(1, 1);
    assertEquals(4, LonelyInteger.solution(a));
  }

  @Test
  public void test2() {
    a.addAll(Arrays.asList(15, 60, 74, 1, 94, 93, 28, 48, 70, 98, 45, 94, 42, 45, 48, 1, 72, 9, 24, 93, 41, 70,
        60, 28, 11, 20, 72, 35, 11, 98, 31, 74, 31, 41, 9, 42, 20, 35, 24));
    assertEquals(15, LonelyInteger.solution(a));
  }

}
