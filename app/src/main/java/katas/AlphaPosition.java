/*When provided with a letter, return its position in the alphabet.

Input :: "a"

Output :: "Position of alphabet: 1"

Note: Only lowercased English letters are tested
*/

package katas;

public class AlphaPosition {

  public static String position(char alphabet)
  {
    char lowerCaseAlphabet = Character.toLowerCase(alphabet);
    if (lowerCaseAlphabet >= 'a' && lowerCaseAlphabet <= 'z') {
      int position = (int)lowerCaseAlphabet - (int)'a' + 1;
      return "Position of alphabet: " + position;
    } else {
      return "Is not an alphabet character";
    }
  }
  
}
