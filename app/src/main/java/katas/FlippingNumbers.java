package katas;

public class FlippingNumbers {
  public static long solution(long number) {
    // XOR with 32 bits of 1s (0xFFFFFFFFL) will flip the lower 32 bits.
    // The result is treated as an unsigned 32-bit integer, returned as a long.
    return number ^ 0xFFFFFFFFL;
  }
}
