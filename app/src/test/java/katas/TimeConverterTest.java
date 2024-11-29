package katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeConverterTest {
  @Test
  public void tests(){
    assertEquals("12:45:54", TimeConverter.timeConversion("12:45:54PM"));
    assertEquals("00:45:54", TimeConverter.timeConversion("12:45:54AM"));
    assertEquals("19:05:45", TimeConverter.timeConversion("07:05:45PM"));
    assertEquals("07:05:45", TimeConverter.timeConversion("07:05:45AM"));
    assertEquals("00:01:00", TimeConverter.timeConversion("12:01:00AM"));
    assertEquals("12:01:00", TimeConverter.timeConversion("12:01:00PM"));
    assertEquals("00:40:22", TimeConverter.timeConversion("12:40:22AM"));
  }
}
