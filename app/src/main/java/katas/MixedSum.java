package katas;

import java.util.List;

public class MixedSum {
  public int sum (List<?> mixed) {
    int num = 0;
    for (Object item: mixed) {
      if( item instanceof Number) {
        num += ((Number) item).intValue(); 
      }
      else if (item instanceof String) {
        num += Integer.parseInt((String) item);
      }
    }
    return (num);
  }
}
