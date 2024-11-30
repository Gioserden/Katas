package katas;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {
  public static List<Integer> solution(List<String> strings, List<String> querys) {
    List<Integer> numbers = new ArrayList<>();
    int ind = 0;
    for (int i = 0; i < querys.size(); i++) {
      ind = 0;
      for (int j = 0; j < strings.size(); j++) {
        if (querys.get(i).equals(strings.get(j))) {
          ind++;
        }
      }
      numbers.add(ind);
    }
    return numbers;
  }

}
