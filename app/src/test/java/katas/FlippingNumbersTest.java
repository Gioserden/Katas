package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlippingNumbersTest {
  @Test
  public void test1 () {
    long number = 1;
    assertEquals(4294967294L, FlippingNumbers.solution(number));
  }

  @Test
  public void test3 () {
    long number = 0;
    assertEquals(4294967295L, FlippingNumbers.solution(number));
  }

  @Test
  public void test2 (){
    long number = 802743475;
    assertEquals(3492223820L, FlippingNumbers.solution(number));
  }
  
}
