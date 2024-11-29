package katas;

import java.util.List;

public class LonelyInteger {
  public static int solution(List<Integer> a) {
    int number = a.get(0);
    int ind = 0;

    for(int i = 0 ; i < a.size() ; i++) {
      ind = 0;
      number = a.get(i);
      for (int j = 0 ; j< a.size(); j++){
        if( number == a.get(j)) {
          ind++;
        }
      }
      if (ind == 1) {
        return number;
      }
    }

    return number;
  }

}
