/*When provided with a letter, return its position in the alphabet.

Input :: "a"

Output :: "Position of alphabet: 1"

Note: Only lowercased English letters are tested
*/

package katas;

public class AlphaPosition {

  public static String position(char alphabet)
  {
    Character.toLowerCase(alphabet);
    switch (alphabet) {
      case 'a':
        return "Position of alphabet: 1";
      case 'b':
        return "Position of alphabet: 2";
      case 'c':
        return "Position of alphabet: 3";
      case 'd':
        return "Position of alphabet: 4";
      case 'e':
        return "Position of alphabet: 5";
      case 'f':
        return "Position of alphabet: 6";
      case 'g':
        return "Position of alphabet: 7";
      case 'h':
        return "Position of alphabet: 8";
      case 'i':
        return "Position of alphabet: 9";
      case 'j':
        return "Position of alphabet: 10";
      case 'k':
        return "Position of alphabet: 11";
      case 'l':
        return "Position of alphabet: 12";
      case 'm':
        return "Position of alphabet: 13";
      case 'n':
        return "Position of alphabet: 14";
      case 'o':
        return "Position of alphabet: 15";
      case 'p':
        return "Position of alphabet: 16";
      case 'q':
        return "Position of alphabet: 17";
      case 'r':
        return "Position of alphabet: 18";
      case 's':
        return "Position of alphabet: 19";
      case 't':
        return "Position of alphabet: 20";
      case 'u':
        return "Position of alphabet: 21";
      case 'v':
        return "Position of alphabet: 22";
      case 'w':
        return "Position of alphabet: 23";
      case 'x':
        return "Position of alphabet: 24";
      case 'y':
        return "Position of alphabet: 25";
      case 'z':
        return "Position of alphabet: 26";
      default:
        return "Is not an alphabet character";
    }
  }
  
}
