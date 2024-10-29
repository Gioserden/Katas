package katas;

public class FirstNonConsecutive {
  static Integer find(final int[] array) {
    int number;
    for(int p =0; p < array.length  - 1; p++)
    {
      number = array[p] + 1;
      if(number != array[p + 1])
          return array[p + 1];
    }
    return null;
  }
}
