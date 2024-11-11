package katas;

public class CamelCase {
  public static String stringToCamelCase (String word) {
    String[] words = word.split("[^a-zA-Z$]");

    StringBuilder wordsList = new StringBuilder(words[0]);

    for( int i = 1; i < words.length; i ++) {
      wordsList.append(words[i].substring(0, 1).toUpperCase());
      wordsList.append(words[i].substring(1));
    }
    return wordsList.toString();
  }
}
